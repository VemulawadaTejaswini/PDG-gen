import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {
	
	Scanner sc;
	int[] enter;
	int time(int n){
		return 17*(n%2)+3*(n%3)+19; 
	}
	
	void solve(){
		int[] seats=new int[17];
		Arrays.fill(seats,-1);
		LinkedList<Integer> queue=new LinkedList<Integer>();
		
		int[] finish=new int[100];
		enter=new int[100];
		
		int nq=0,ns=0;
		for(int t=0;ns<100;++t){
			//離席
			for(int i=0;i<17;++i){
				if(seats[i]!=-1&&t>=finish[seats[i]]){
					seats[i]=-1;
				}
			}
			//来店
			if(nq<100&&t%5==0){
				queue.add(nq++);
			}
			//空席判定
			for(int i=0;i<17&&!queue.isEmpty();++i){
				if(seats[i]==-1){
					//[i,j[ : 連続空席
					int j=i;
					for(;j<17&&seats[j]==-1;++j);
					int s=j-i;
					//店に這入れるなら入れる
					//p:客数
					int p=(queue.peek()%5==1)?5:2;
					if(s>=p){
						int group=queue.poll();
						for(int k=i;k<i+p;++k){
							seats[k]=group;
						}
						enter[group]=t;
						finish[group]=t+time(group);
						++ns;
					}
				}
			}
			//debug(t,seats);
		}
	}
	
	int ni(){
		return sc.nextInt();
	}

	void io(){
		sc=new Scanner(System.in);
		solve();
		while(sc.hasNext()){
			int n=ni();
			System.out.println(enter[n]-n*5);
		}
	}
	
	void debug(Object...os){
		System.err.println(Arrays.deepToString(os));
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Main().io();
	}
}
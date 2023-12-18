import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		while(true){
			int M=in.nextInt(),T=in.nextInt(),P=in.nextInt(),R=in.nextInt();
			if(M==0 && T==0)break;

			team data[]=new team[T];
			for(int i=0;i<T;i++)data[i]=new team(i+1,0,0);

			for(int i=0;i<R;i++){
				int m=in.nextInt(),t=in.nextInt(),p=in.nextInt(),j=in.nextInt();
				if(j==0){
					data[t-1].prob++;
					data[t-1].wasWA(p);
					data[t-1].time+=m;
				}
				else data[t-1].WA.add(p);
			}
			
			//for(int i=0;i<T;i++)System.out.printf("team=%d, solved=%d, time=%d\n",data[i].no,data[i].prob,data[i].time);
			
			//sort
			boolean flag=true;
			for(int i=0;flag;i++){
				flag=false;
				for(int j=T-1;j>=i+1;j--){
					if(data[j].prob>data[j-1].prob){
						swap(data,j,j-1);
						flag=true;
					}
					else if(data[j].prob==data[j-1].prob && data[j].time<data[j-1].time){
						swap(data,j,j-1);
						flag=true;
					}
					else if(data[j].prob==data[j-1].prob && data[j].time==data[j-1].time && data[j].no>data[j-1].no){
						swap(data,j,j-1);
						flag=true;
					}
				}
			}
			
			//System.out.println();
			//for(int i=0;i<T;i++)System.out.printf("team=%d, solved=%d, time=%d\n",data[i].no,data[i].prob,data[i].time);
			for(int i=0;i<T-1;i++){
				if(data[i].prob==data[i+1].prob && data[i].time==data[i+1].time)System.out.printf("%d=",data[i].no);
				else System.out.printf("%d,",data[i].no);
			}
			System.out.printf("%d\n",data[T-1].no);
		}
	}
	
	static void swap(team[] A,int i,int j){
		team tt=A[i];
		A[i]=A[j];
		A[j]=tt;
	}

}

class team{
	int no,prob,time;
	List<Integer> WA;

	team(int n,int p,int t){
		no=n; prob=p; time=t;
		WA=new ArrayList<>();
	}

	void wasWA(int p){
		for(int i=0;i<WA.size();i++){
			if(WA.get(i)==p)time+=20;
		}
	}
}


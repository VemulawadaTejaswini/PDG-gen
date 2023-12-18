
import java.util.Scanner;

public class Main {

	static Scanner sc = new Scanner(System.in);
	static int n=sc.nextInt();
	static int m=sc.nextInt();
	
	int[] count(int[] ass,int[] cost){
		int[] cnt = new int[n];
		for(int i=0;i<m;i++){
			for(int j=0;j<n;j++){
				if(ass[i]>=cost[j]){
					cnt[j]++;
					break;
				}
			}
		}
		return cnt;
	}
	int count(int[] cnt){
		int best=cnt[0];
		int index=0;
		for(int i=1;i<n;i++){
			if(best<cnt[i]){
				best=cnt[i];
				index=i;
			}
		}
		return index+1;
	}
	void doIt(){
		int cost[]=new int[n];//競技にかかる費用
		int ass[]=new int[m];//審査員の評価基準
		int cnt[]=new int[n];//票数
		int index;
		for(int i=0;i<n;i++){
			cost[i]=sc.nextInt();
		}
		for(int i=0;i<m;i++){
			ass[i]=sc.nextInt();
		}
		cnt=count(ass,cost);
		index=count(cnt);
		System.out.println(index);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		new Main().doIt();
		
	}

}
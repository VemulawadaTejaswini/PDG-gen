import java.util.*;

public class Main {
	Scanner in = new Scanner(System.in);
	public static void main(String[] args) {
		new Main();
	}

	public Main(){
		new AOJ1135().doIt();
	}
	
	class AOJ1135{
		int n,m;
		
		void solve(){
			int taro[] = new int[n];
			int hana[] = new int[m];
			for(int i=0;i<n;i++)taro[i] = in.nextInt();
			for(int i=0;i<m;i++)hana[i] = in.nextInt();
			Arrays.sort(taro);Arrays.sort(hana);
			int tsum = 0,hsum = 0;
			for(int i=0;i<n;i++)tsum += taro[i];
			for(int i=0;i<m;i++)hsum += hana[i];
			int a=-1,b=-1;
			for(int i=0;i<n;i++)for(int s=0;s<m;s++){
				int c = tsum-taro[i]+hana[s];
				int d = hsum-hana[s]+taro[i];
//				System.out.println(c+" "+d);
				if(c==d&&a==-1){
					a=taro[i];b=hana[s];break;
				}
			}
			if(a==-1||b==-1)System.out.println(-1);
			else System.out.println(a+" "+b);
		}
		
		void doIt(){
			while(in.hasNext()){
				n = in.nextInt(); 
				m = in.nextInt();
				if(n+m==0)break;
				solve();
			}
		}
	}
	
}
import java.util.*;
public class Main {
	Scanner in = new Scanner(System.in);
	public static void main(String[] args) {
		new Main();
	}

	public Main() {
		new AOJ2199().doIt();
	}
	
	class AOJ2199{
		int[] c;
		int[] x;
		int n,m;
		double avr;
		void solve(){
			avr = 0;
			for(int i=0;i<n;i++)avr += x[i];
			avr = avr/n;
//			System.out.println(avr);
			int result = 0;
			int before = 128;
			for(int i=0;i<n;i++){
				int min = Integer.MAX_VALUE/2;
				int memo = -1;
				for(int s=0;s<m;s++){
					int a = before + c[s];
					if(a>255)a = 255;
					else if(a<0)a=0;
					if(min>Math.abs(x[i]-a)){
						memo = a;
						min = (int) Math.abs(x[i]-a);
					}
				}
//				System.out.println(memo);
				before = memo;
				result += ((x[i]-memo)*(x[i]-memo));
			}
			System.out.println(result);
		}
		
		void doIt(){
			while(in.hasNext()){
				n = in.nextInt();
				m = in.nextInt();
				if(n==0&&m==0)break;
				c = new int[m];x = new int[n];
				for(int i=0;i<m;i++)c[i] = in.nextInt();
				for(int i=0;i<n;i++)x[i] = in.nextInt();
				solve();
			}
		}
	}
	
}
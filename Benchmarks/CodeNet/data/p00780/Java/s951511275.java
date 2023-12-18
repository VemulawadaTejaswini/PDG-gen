import java.util.*;
public class Main {
	Scanner in = new Scanner(System.in);
	public static void main(String[] args) {
		new Main();
	}
	public Main() {
		new AOJ1200().doIt();
	}
	class AOJ1200{
		void doIt(){
			int max = 1<<15;
			max += 100;
			boolean prime[] = new boolean[max];
			Arrays.fill(prime, true);
			prime[0] = false;prime[1] = false;
			for(int i=0;i<max;i++)if(prime[i]){
				for(int s=i+i;s<max;s+=i)prime[s] = false;
			}
			while(true){
				int n = in.nextInt();
				if(n==0)break;
				int cnt = 0;
				for(int i=2;i<=n/2;i++){
					if(prime[i]&&prime[n-i])cnt++;
				}
				System.out.println(cnt);
			}
		}
	}
}
import java.util.*;

public class Main {
	Scanner in = new Scanner(System.in);
	public static void main(String[] args) {
		new Main();
	}

	public Main() {
		new AOJ0009().doIt();
	}
	
	class AOJ0009{
		void doIt(){
			boolean[] prime = new boolean[999999+1];
			int n = prime.length;
			Arrays.fill(prime, true);prime[0] = false;prime[1] = false;
			for(int i=2;i<n;i++)if(prime[i])for(int s=i+i;s<n;s+=i)prime[s]=false;
			while(in.hasNext()){
				int cnt = 0;
				int t = in.nextInt();
				for(int i=0;i<=t;i++)if(prime[i])cnt++;
				System.out.println(cnt);
			}
		}
	}
	
}
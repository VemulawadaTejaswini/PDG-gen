import java.util.*;

public class Main {
	Scanner in = new Scanner(System.in);
	public static void main(String[] args) {
		new Main();
	}

	public Main(){
		new AOJ1172().doIt();
	}
	
	class AOJ1172{
		int N = 123456*2+5;
		void doIt(){
			boolean[] prime = new boolean[N];
			Arrays.fill(prime, true);prime[0] = false;prime[1] = false;
			for(int i=2;i<N;i++)if(prime[i]){
				for(int s=i+i;s<N;s+=i)prime[s] = false;
			}
			while(in.hasNext()){
				int input = in.nextInt();
				if(input==0)break;
				int cnt = 0;
				for(int i=input+1;i<=input*2;i++)if(prime[i])cnt++;
				System.out.println(cnt);
			}
		}
	}
	
}
import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		while(true) {
			int m=Integer.parseInt(in.next()),n=Integer.parseInt(in.next());
			if(m==0)break;
			solve(m,n);
		}


	}

	static void solve(int m, int n) {
		boolean sieve[] = new boolean[10000000];
		Arrays.fill(sieve, true);
		List<Integer> list = new ArrayList<>();
		for(int i=m; i<sieve.length; i++) {
			if(sieve[i]) {
				list.add(i);
				for(int j=i*2; j<sieve.length; j+=i)sieve[j]=false;
			}

			if(list.size()==(n+1))break;
		}

		System.out.println(list.get(n));
	}

}


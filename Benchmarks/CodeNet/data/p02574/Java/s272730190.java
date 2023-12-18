import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int[] A = new int[N];
		for(int i=0; i<N; i++)
			A[i] = sc.nextInt();
		
		boolean[] b = new boolean[1001];
		Arrays.fill(b, true);
		for(int i=2; i<=500; i++) {
			if(b[i]) {
				for(int j=i+i; j<=1000; j+=i)
					b[j]=false;
			}
		}
		ArrayList<Integer> prime = new ArrayList<>();
		for(int i=2; i<=1000; i++)
			if(b[i])
				prime.add(i);

		HashSet<Integer> factor = new HashSet<>();
		long gcd = A[0];
		boolean isPairwiseCoprime = true;
		for(int i=1; i<N; i++) {
			gcd = gcd(gcd, A[i]);
			for(int p : prime) {
				if(A[i]<p)
					break;
				if(A[i]%p==0) {
					if(factor.contains(p)) {
						isPairwiseCoprime = false;
						break;
					}
					while(A[i]%p==0)
						A[i]/=p;
					factor.add(p);
				}
			}
			if(A[i]>=2) {
				if(factor.contains(A[i])) {
					isPairwiseCoprime = false;
				} else {
					factor.add(A[i]);
				}
			}
		}
		
		if(isPairwiseCoprime) {
			System.out.println("pairwise coprime");
		} else if(gcd==1) {
			System.out.println("setwise coprime");
		} else {
			System.out.println("not coprime");
		}
		
		sc.close();
	}
	
	static long gcd(long a, long b) {
		return a==0 ? b : gcd(b%a, a);
	}
}


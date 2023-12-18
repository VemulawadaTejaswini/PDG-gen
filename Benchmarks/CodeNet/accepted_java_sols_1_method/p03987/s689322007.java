import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int[] a = new int[N];
		int[] rev = new int[N+1];
		for(int i=0; i<N; i++) {
			a[i] = sc.nextInt();
			rev[a[i]] = i;
		}
		
		long ans = 0;
		
		TreeSet<Integer> sorted = new TreeSet<>();
		sorted.add(-1);
		sorted.add(N);
		
		for(int i=1; i<=N; i++) {
			int l = sorted.lower(rev[i]);
			int r = sorted.higher(rev[i]);
			ans += (long)i*(rev[i]-l)*(r-rev[i]);
			sorted.add(rev[i]);
		}
		
		System.out.println(ans);
		sc.close();
	}
}

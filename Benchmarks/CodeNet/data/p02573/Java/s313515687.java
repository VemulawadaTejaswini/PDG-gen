import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		Set<Long> set = new HashSet<Long>();
		int A[]= new int[N+1];;
		for (int i=0;i<M;i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			long l = (long)a*1000000+(long)b;
			if (set.contains(l)==false) {
				set.add(l);
				l = (long)b*1000000+(long)a;
				set.add(l);
				A[a]++;
				A[b]++;
			}
		}
		int max = 0;
		for (int i=1;i<=N;i++) {
			if (A[i]>max) {
				max = A[i];
			}
		}
		System.out.println(max+1);
	}
}
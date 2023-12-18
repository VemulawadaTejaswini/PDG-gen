import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		long[] a = new long[n];
		long sum =0;
		for(int i=0;i<n;i++) {
			a[i] = scan.nextLong();
			sum+=a[i];
		}
		Arrays.sort(a);
		System.out.println(sum-a[0]);
	}

}

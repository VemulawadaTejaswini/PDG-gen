import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int k = scan.nextInt();
		long h[]=new long[n];
		for(int i=0;i<n;i++) {
			h[i]=scan.nextLong();
		}
		scan.close();
		Arrays.sort(h);
		long sum=0;
		for(int i=0;i<n-k;i++) {
			sum+=h[i];
		}
		System.out.println(sum);
	}
}

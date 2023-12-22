import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int p[] = new int[A];
		int sum  =0;
		for (int i=0;i<A;i++) {
			p[i] = sc.nextInt();
		}
		Arrays.parallelSort(p);
		for (int i=0;i<A-1;i++) {
			sum +=p[i];
		}
		sum +=p[A-1]/2;
		System.out.println(sum);
	}
}

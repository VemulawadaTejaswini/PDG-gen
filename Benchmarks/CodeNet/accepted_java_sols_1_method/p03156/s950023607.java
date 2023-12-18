
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int A = sc.nextInt();
		int B = sc.nextInt();
		int a= 0;
		int b =0;
		int c =0;
		for (int i=0;i<N;i++) {
			int temp = sc.nextInt();
			if (A>=temp) {
				a++;
			} else if (B<temp) {
				c++;
			} else {
				b++;
			}
		}
		System.out.println(Math.min(a, Math.min(c, b)));
	}
}

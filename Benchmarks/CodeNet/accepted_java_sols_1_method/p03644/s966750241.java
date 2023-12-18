
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		sc.close();
		int[]a = new int[7];
		a[0] = 1;
		for(int i = 1; i < 7; i++) {
			a[i] = a[i - 1] * 2;
		}
		for(int i = 0; i < 7; i++) {
			if(N == a[i]) {
				System.out.println(N);
				System.exit(0);
			}else if(N < a[i]) {
				System.out.println(a[i - 1]);
				System.exit(0);
			}
		}
		System.out.println(a[6]);
	}
}
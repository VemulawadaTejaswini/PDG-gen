import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int b[] = new int[n - 1];
		int c[] = new int[n];
		for(int i = 0 ; i < n - 1 ; i++) {
			b[i] = sc.nextInt();
		}
		for(int i = 0 ; i < n - 1 ; i++) {
			if(i == 0) {
				c[i] = b[i];
			} else {
				c[i] = Math.min(b[i - 1], b[i]);
			}
		}
		c[n - 1] = b[n - 2];
		int ans = Arrays.stream(c).sum();
		System.out.println(ans);
		sc.close();

	}

}

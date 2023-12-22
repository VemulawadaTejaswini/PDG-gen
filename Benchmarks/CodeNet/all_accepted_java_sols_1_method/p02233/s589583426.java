import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int ans = 0;
		if (N == 0) {
			System.out.println(1);
		} else {
			if (N == 1) {
				System.out.println(1);
			} else {
				ans = 2;
				int a = 1;
				int b = 1;
				while (N > 2) {
					int temp = b;
					b = ans;
					ans = ans + temp;
					a = temp;
					N = N - 1;
				}
				System.out.println(ans);
			}
		}
	}

}
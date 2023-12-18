import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n, k;
		int s[];
		int a[][];
		boolean f;


		while (true) {
			n = sc.nextInt();
			k = sc.nextInt();
			if ((n | k) == 0) {
				break;
			}
			s = new int[k];
			for (int i = 0; i < k; i++) {
				s[i] = sc.nextInt();
			}
			f = true;
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < k; j++) {
					s[j] -= sc.nextInt();
					if (s[j] < 0) {
						f = false;
					}
				}
			}
			
			System.out.println(f == true ? "Yes" : "No");
		}
	}
}
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int p[] = new int[N];

		int cnt=0;
		for (int i = 0; i < p.length; i++) {
			p[i] = sc.nextInt();

			if ((i+1)!=p[i]) {
				cnt++;
			}
		}
		if (cnt <= 2) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}
	}
}

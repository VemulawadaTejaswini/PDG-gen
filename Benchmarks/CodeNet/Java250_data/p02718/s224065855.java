import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt(), m = sc.nextInt(), vn = 0, cnt = 0, p[] = new int[n];

		for(int i = 0; i < n; i++) {
			p[i] = sc.nextInt();
			vn += p[i];
		}

		double b = vn / 4.0 / m;

		for(int i = 0; i < n; i++) {
			if(b <= p[i]) cnt++;
		}

		System.out.println(m <= cnt ? "Yes" : "No");
	}
}
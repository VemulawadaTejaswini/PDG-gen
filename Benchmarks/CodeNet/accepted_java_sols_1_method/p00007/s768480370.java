import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();
		int m = 100000;
		for(int i = 0; i < n; i++) {
			m = m * 105 / 100;
			int res = m - (m / 1000) * 1000;
			if(res != 0) {
				m = (m / 1000) * 1000 + 1000;
			}
		}
		System.out.println(m);
	}
}

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		int n = 0, m = 0;
		try (Scanner sc = new Scanner(System.in)) {
			while (true) {
				m = sc.nextInt();
				n = sc.nextInt();
				if(m == 0 && n == 0) {
					break;
				}
				if(m > n) {
					m = m ^ n;
            		n = m ^ n;
            		m = m ^ n;
				}
				System.out.println(String.format("%d %d",m, n));
			}
		}
	}
}


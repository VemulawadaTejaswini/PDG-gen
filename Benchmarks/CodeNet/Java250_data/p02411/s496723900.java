import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int m, f, r;
		while(true) {
			m = in.nextInt();
			f = in.nextInt();
			r = in.nextInt();
			if(m == -1 && f == -1 && r == -1) break;

			char ch = 'F';
			int mf = m+f;
			if(m == -1 || f == -1) {
				ch = 'F';
			}
			else if(mf >= 80) {
				ch = 'A';
			}
			else if(65 <= mf) {
				ch = 'B';
			}
			else if(50 <= mf) {
				ch = 'C';
			}
			else if(30 <= mf) {
				ch = 'D';
				if(50 <= r) {
					ch = 'C';
				}
			}
			System.out.println(ch);
		}
	}
}
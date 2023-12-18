import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int d = sc.nextInt();

		do {
			c -= b;
			if(c <= 0) {
				System.out.print("Yes");
				return;
			}
			else {
				a -= d;
				if(a <= 0) {
					System.out.print("No");
					return;
				}
			}
		}while(a != 0 && c != 0);
	}
}
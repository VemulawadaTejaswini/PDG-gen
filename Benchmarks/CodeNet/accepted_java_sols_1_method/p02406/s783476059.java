import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int i = 1;
		int x;
		//CHECK_NUM
		do {
			x = i;
			if (x % 3 == 0) {
				System.out.print(" "+i);
			} else while (true) { //INCLUDE3
				if (x % 10 ==3) {
					System.out.print(" "+i);
					break;
				} else {
					x /= 10;
					if (x != 0) continue;
					else break;
				}
			}
		} while (++i <= n);
		// END_CHECK_NUM
		System.out.println();
	}
}
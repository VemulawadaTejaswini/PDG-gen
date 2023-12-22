
import java.util.Scanner;

public class Main {
 
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int a = sc.nextInt();
			
			int tmp = 0;
			int before = -1;
			int cnt = 0;
			for (int i = 0; i < 4; i++) {
				before = tmp;
				tmp = a % 10;
				a /= 10;
				if (before == tmp) {
					cnt++;
					if (cnt >= 2) {
						System.out.println("Yes");
						return;
					}
				}
				else cnt = 0;
			}
 
			if (cnt >= 2) {
				System.out.println("Yes");
			} else {
				System.out.println("No");
			}
		}
	}
}
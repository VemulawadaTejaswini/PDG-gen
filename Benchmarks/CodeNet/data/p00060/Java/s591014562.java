import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int c1, c2, c3;
		int count;
		
		while (sc.hasNext()) {
			c1 = sc.nextInt();
			c2 = sc.nextInt();
			c3 = sc.nextInt();
			count = 0;
			
			for (int i = 1; i <= 10 && i + c1 + c2 <= 20; i++) {
				if (i != c1 && i != c2 && i != c3) {
					count++;
				}
			}
			if (4 <= count) {
				System.out.println("YES");
			} else {
				System.out.println("NO");
			}
		}
	}
}
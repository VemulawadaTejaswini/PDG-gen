import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int n = scan.nextInt();
		int k;
		
		for (int i = 1; i <= n; i++) {
			if (i % 3 == 0) {
				System.out.print(" " + i);
			}
			else {
				k = i;
				while (true) {
					if (k < 3) break;
					else if (k % 10 == 3) {	
						System.out.print(" " + i);
						break;
					}
					else {
						k = k / 10;
					}
				}
			}
		}
		System.out.println();
	}
}

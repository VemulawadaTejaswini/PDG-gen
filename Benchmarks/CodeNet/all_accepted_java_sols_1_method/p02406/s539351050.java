import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);		
		int n = scan.nextInt();
		
		for (int i = 1; i <= n; i++) {
			int x = i;
			if (x % 3 == 0) {
				System.out.print(" " + i);
				continue;
			}
			if (x % 10 == 3) {
				System.out.print(" " + i);
				continue;
			}
			
			for (x /= 10; x != 0; x /= 10) {
				if (x % 10 == 3) {
					System.out.print(" " + i);
					break;
				}
			}
		}
		System.out.println();
		scan.close();
	}

}
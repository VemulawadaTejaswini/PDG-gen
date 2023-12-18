import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int ice[];
		int n;
		
		while (true) {
			n = sc.nextInt();
			if (n == 0) {
				break;
			}
			
			ice = new int[10];
			for (int i = 0; i < n; i++) {
				ice[sc.nextInt()]++;
			}
			for (int i = 0; i < 10; i++) {
				if (ice[i] == 0) {
					System.out.print("-");
				} else {
					for (int j = 0; j < ice[i]; j++) {
						System.out.print("*");
					}
				}
				System.out.println();
			}
		}
	}
}
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int A = scanner.nextInt();
		int B = scanner.nextInt();
		int C = scanner.nextInt();
		int X = scanner.nextInt();
		scanner.close();
		int ans = 0;
		for (int a = 0; a <= A; a++) {
			for (int b = 0; b <= B; b++) {
				for (int c = 0; c <= C; c++) {
					if (a*500 + b*100 + c*50 == X) {
						ans++;
					}
					if (a*500 + b*100 + c*50 >= X) {
						break;
					}
				}
				if (a*500 + b*100 >= X) {
					break;
				}
			}
			if (a*500 >= X) {
				break;
			}
		}
		System.out.println(ans);
	}
	
}
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int x = scanner.nextInt();
		int n = scanner.nextInt();
		int[] p = new int[n];
		int ans = x;
		int dif = 1;
		int flag = 1;
		
		for (int i = 0; i < n; i++) {
			p[i] = scanner.nextInt();
		}
		
		for (int i = 0; i < n; i++) {
			if (p[i] == x) {
				flag = 0;
				break;
			}
		}
		
		while (flag == 0) {
			flag = 1;
			
			for (int i = 0; i < n; i++) {
				if (p[i] == x - dif) {
					flag = 0;
					break;
				}
			}
			
			if (flag == 1) {
				ans = x - dif;
				break;
			}
			
			flag = 1;
			
			for (int i = 0; i < n; i++) {
				if (p[i] == x + dif) {
					flag = 0;
					break;
				}
			}
			
			if (flag == 1) {
				ans = x + dif;
				break;
			}
			
			dif++;
		}
		
		System.out.println(ans);

	}

}

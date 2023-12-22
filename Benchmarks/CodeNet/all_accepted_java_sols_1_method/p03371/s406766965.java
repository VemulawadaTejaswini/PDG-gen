
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int c = scanner.nextInt();
		int x = scanner.nextInt();
		int y = scanner.nextInt();
		int min = y;
		int minxy = b;
		int max = x;
		int maxxy = a;
		if (x < y) {
			min = x;
			minxy = a;
			max = y;
			maxxy = b;  
		}
		
		int ans = (a * x) + (b * y);
		int ans2 = (min * 2) * c + ((max - min) * maxxy);
		int ans3 = (max * 2) * c;
		ans = Math.min(ans, ans2);
		ans = Math.min(ans, ans3);
		System.out.println(ans);
		
		scanner.close();
	}

}

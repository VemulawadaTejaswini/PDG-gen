
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int x = sc.nextInt();
		int ans = 0;
		for(int i = 0; i < a + 1; i++) {
			for(int j = 0; j < b + 1; j++) {
				for(int k = 0; k < c + 1; k++) {
					int tmp = 50 * k + 100 * j + 500 * i;
					if(tmp > x)
						break;
					else if(tmp == x)
						ans++;
				}
			}
		}
		System.out.println(ans);
	}
}

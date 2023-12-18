import java.io.IOException;
import java.util.Scanner;

class Main {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		int y = sc.nextInt();
		
		int ans = x + y + 1;
		while(true) {
			if(x < y) {
				int tmp = x;
				x = y;
				y = tmp;
				continue;
			}
			if(y == 0) {
				ans -= x;
				break;
			}
			x %= y;
		}
		
		System.out.println(ans);
	}
}

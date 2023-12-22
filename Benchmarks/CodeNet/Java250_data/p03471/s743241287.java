
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int x = sc.nextInt();
		boolean ans = false;
		int i = 0;
		int j = 0;
		if(x % 1000 == 0) {
			x = x / 1000;
			for(i = 0; i < n + 1; i++) {
				for(j = 0; j < n + 1 - i; j++) {
					if(x == i + j * 5 + (n - i - j) * 10) {
						ans = true;
						break;
					}
				}
				if(ans)
					break;
			}
		}
		if(ans) {
			System.out.println((n - i - j) + " " + j + " " + i);
		} else {
			System.out.println(-1 + " " + -1 + " " + -1);
		}
	}

}

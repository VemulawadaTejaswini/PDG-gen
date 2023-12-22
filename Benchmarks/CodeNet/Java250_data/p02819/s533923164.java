import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();

		while(true) {
			if(x == 2 || x == 3 || x == 5) {
				break;
			} else if(x%2 == 0 || x%3 == 0 || x%5 == 0) {
				x++;
				continue;
			}
			boolean sosu = false;
			for(int i = 7; i <= x; i++) {
				if(x%i == 0 && i != x) {
					// 自身以外の数で割り切れた場合は素数ではない
					x++;
					break;
				} else if(x%i == 0 && i == x) {
					sosu = true;
					break;
				}
			}
			if(sosu) {
				break;
			}
		}
		System.out.println(x);
	}
}
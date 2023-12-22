import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		for(int i = 1 ; i <= 10000; i++) {
			int x = sc.nextInt();
			int y = sc.nextInt();
			int t = 0;
			if(x > y) {
				t = x;
				x = y;
				y = t;
			}
			if(x == 0 && y == 0) {
				break;
			}
			System.out.println(x + " " + y);
		}
	}
}
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		if(x > 0 && y > 0 && x > y) {
			System.out.println(Math.abs(x - y) + 2);
		} else if(x > 0 && y >= 0 && x > y) {
			System.out.println(Math.abs(x - y) + 1);
		} else if(x >= 0 && y >= 0 && x < y) {
			System.out.println(Math.abs(x - y));
		} else if(x >= 0 && y < 0 || x < 0 && y > 0) {
			System.out.println(Math.abs(x + y) + 1);
		} else if(x < 0 && y == 0) {
			System.out.println(y - x);
		} else if(x < 0 && y < 0 && x < y) {
			System.out.println(y - x);
		} else {
			System.out.println(Math.abs(-x + y) + 2);
		}
	}
}

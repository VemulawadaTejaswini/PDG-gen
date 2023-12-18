import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		for(int i = 0;; i++) {
			int x = sc.nextInt();
			int y = sc.nextInt();
			if(x > y) {
				System.out.println(y + " " + x);
			} else if(x < y) {
				System.out.println(x + " " + y);
			} else if(x == 0 && y == 0) {
				break;
			} else {
				System.out.println(x + " " + y);
			}
		}
	}
}
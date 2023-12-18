import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
			while (true) {
            // 入力されるx,yを定義

            int x = scanner.nextInt();
            int y = scanner.nextInt();

            if (x == 0 && y == 0) {
            	break;
            }
            if (x <= y) {
            	System.out.println(x + " " + y);
            } else if (y < x) {
            	System.out.println(y + " " + x);
            }
			}
	}
}


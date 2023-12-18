import java.util.*;

public class Main {
	public static void main(String[] args) {

            // 入力されるx,yを定義
			Scanner scanner = new Scanner(System.in);
            int x = scanner.nextInt();
            int y = scanner.nextInt();

            // 計算式
            int d = x / y;
            int r = x % y;
            double f = (double)x / y;

            System.out.println(d + " " + r + " " + String.format("%.8f", f));
	}
}


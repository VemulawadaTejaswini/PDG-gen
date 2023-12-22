import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
			int i = 1;
			while (true) {
            // 入力されるxを定義
            int x = scanner.nextInt();
            if (x == 0) {
            	break;
            }
            System.out.println("Case " + i + ": " + x);
            i++;
			}
	}
}


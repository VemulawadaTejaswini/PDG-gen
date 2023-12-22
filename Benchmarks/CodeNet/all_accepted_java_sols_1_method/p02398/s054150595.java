import java.util.*;

public class Main {
	public static void main(String[] args) {
			Scanner scanner = new Scanner(System.in);

            // 空白で分割してaとb,cを定義

            int a = scanner.nextInt();

            int b = scanner.nextInt();

            int c = scanner.nextInt();

            int count = 0;
            for (int x = a; x <= b; x++) {
            	int div = c % x;
            	if (div == 0) {
            		count++;
            	}
            }
            System.out.println(count);
	}
}


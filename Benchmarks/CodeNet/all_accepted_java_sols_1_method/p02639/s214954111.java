import java.util.Scanner;

public class Main {
        public static void main(String[] args) {
                Scanner scan = new Scanner(System.in);

                	for (int i = 1; i <= 5; i++) {
                		int x = scan.nextInt();
                		if (x == 0) {
                			System.out.println(i);
                			break;
                		}
                	}

                	scan.close();

        }
}
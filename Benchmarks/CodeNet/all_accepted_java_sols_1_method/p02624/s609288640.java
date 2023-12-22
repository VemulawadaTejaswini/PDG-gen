import java.util.Scanner;

public class Main {
        public static void main(String[] args) {
                Scanner scan = new Scanner(System.in);

                int N = scan.nextInt();

                long count = 0;

                for (long i = 1; i <= N; i++) {
                	long position = i;
                	while (position <= N) {
                		count += position;
                		position += i;
                	}
                }

                System.out.println(count);

                scan.close();

        }
}
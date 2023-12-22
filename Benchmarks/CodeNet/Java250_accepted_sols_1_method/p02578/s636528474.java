import java.util.Scanner;

public class Main {
        public static void main(String[] args) {
                Scanner scan = new Scanner(System.in);

                int N = scan.nextInt();

                long sum = 0;

                long mae = 0;
                long now = 0;

                for (int i = 0; i < N; i++) {
                	now = scan.nextLong();
                	if (now < mae) {
                		sum += mae - now;
                		now = mae;
                	}
                	mae = now;
                }

                System.out.println(sum);

                scan.close();

        }

}
import java.util.Scanner;

public class Main {
        public static void main(String[] args) {
                Scanner scan = new Scanner(System.in);

                int N = scan.nextInt();

                int sum = 0;

                int mae = 0;
                int now = 0;

                for (int i = 0; i < N; i++) {
                	now = scan.nextInt();
                	if (now < mae) {
                		sum += mae -now;
                		now = mae;
                	}
                	mae = now;
                }

                System.out.println(sum);

                scan.close();

        }

}
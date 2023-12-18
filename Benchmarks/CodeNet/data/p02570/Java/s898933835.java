import java.util.Scanner;

public class Main {
        public static void main(String[] args) {
                Scanner scan = new Scanner(System.in);

                int D = scan.nextInt();
                int T = scan.nextInt();
                int S = scan.nextInt();

                if (S*T >= D) {
                	System.out.println("Yes");
                } else {
                	System.out.println("No");
                }

                scan.close();

        }
}
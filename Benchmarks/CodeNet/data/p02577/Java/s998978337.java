import java.util.Scanner;

public class Main {
        public static void main(String[] args) {
                Scanner scan = new Scanner(System.in);

                String N = scan.next();

                int sum = 0;

                for (int i = 0; i < N.length(); i++) {
                	sum += Integer.parseInt(N.substring(i,i+1));
                }

                if (sum%9 == 0) {
                	System.out.println("Yes");
                } else {
                	System.out.println("No");
                }

                scan.close();

        }

}
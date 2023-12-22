import java.util.Scanner;

public class Main {
        public static void main(String[] args) {
                Scanner scan = new Scanner(System.in);

                int N = scan.nextInt();
                int M = scan.nextInt();

                int sum = 0;
                
                for (int i= 0; i < M; i++) {
                	sum += scan.nextInt();
                }
                
                int holiday = N - sum;
                
                if (holiday < 0) {
                	holiday = -1;
                }
                
                System.out.println(holiday);
        }

}
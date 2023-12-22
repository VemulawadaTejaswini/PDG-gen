import java.util.Scanner;

public class Main {
        public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
                int A = sc.nextInt();
                int B = sc.nextInt();
                sc.close();
                int r = (B - 1) / (A - 1);
                int d = (B - 1) % (A - 1) > 0 ? 1 : 0;
                System.out.println(r + d) ;
        }
}

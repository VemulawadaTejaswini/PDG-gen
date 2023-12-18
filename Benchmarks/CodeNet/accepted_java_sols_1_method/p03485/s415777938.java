import java.util.*;

public class Main {
        public static void main(String args[]) {
                Scanner sc = new Scanner(System.in);
                int x = sc.nextInt();
                int y = sc.nextInt();
                double a = (x + y) / 2.0;
                System.out.println((int)Math.ceil(a));
        }
}

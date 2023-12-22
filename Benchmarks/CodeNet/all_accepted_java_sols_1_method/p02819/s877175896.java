import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();

        for (int i = 0 ; i < 3000 ; i++) {
            int n = x + i;
            boolean f = true;
            for (int j = 2 ; j <= Math.sqrt(n) ; j++) {
                if (n % j == 0) f = false;
            }
            if (f) {
                System.out.println(x + i);
                return;
            }
        }
    }

}

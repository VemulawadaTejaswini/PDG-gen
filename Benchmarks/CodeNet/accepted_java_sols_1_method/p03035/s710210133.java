import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        //        for (int i = 1; i <= n; i++) {
        //
        //        }

        sc.close();

        if (6 <= a && a <= 12) {
            b /= 2;
        } else if (a <= 5) {
            b = 0;
        }

        System.out.println(b);

    }
}
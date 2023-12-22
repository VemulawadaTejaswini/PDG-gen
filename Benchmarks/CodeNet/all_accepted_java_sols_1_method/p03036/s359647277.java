import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int r = sc.nextInt();
        int d = sc.nextInt();
        int x = sc.nextInt();

        //        for (int i = 1; i <= n; i++) {
        //
        //        }

        sc.close();

        long num = r * x - d;

        System.out.println(num);

        for (int i = 0; i < 9; i++) {
            num = r * num - d;

            System.out.println(num);
        }

        //        System.out.println(b);

    }
}
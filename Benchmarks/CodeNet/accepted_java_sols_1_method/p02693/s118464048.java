import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();

        int value = n;

        for (int i = 0; i < 1000; i++) {

            if (a <= value && value <= b) {
                System.out.println("OK");
                return;
            }

            if (value > 1000) {
                System.out.println("NG");
                return;
            }

            value += n ;
        }

        sc.close();
    }

}
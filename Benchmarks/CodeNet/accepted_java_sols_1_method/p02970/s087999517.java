import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int d = sc.nextInt();

        int x = d * 2 + 1;

        if (n % x == 0) {
            System.out.print(n / x);
        } else {
            System.out.print(n / x + 1);
        }
    }

}
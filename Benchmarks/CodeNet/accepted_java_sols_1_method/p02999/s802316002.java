import java.util.*;

public class Main {

    private static final int _0 = 0;
    private static final int _10 = 10;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int a = sc.nextInt();

        if (x < a) {
            System.out.println(_0);
        } else {
            System.out.println(_10);
        }

        sc.close();
    }
} 
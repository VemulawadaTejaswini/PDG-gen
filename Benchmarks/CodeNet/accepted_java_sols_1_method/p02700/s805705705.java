import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        sc.close();

        boolean flag = true;
        while (a > 0 && c > 0) {
            if (flag) {
                flag = false;
                c -= b;
            } else {
                flag = true;
                a -= d;
            }
        }

        if (c <= 0) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}

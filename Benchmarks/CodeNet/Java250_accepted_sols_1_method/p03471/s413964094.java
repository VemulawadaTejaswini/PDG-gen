import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int y = sc.nextInt();

        int a = 0;
        int b = 0;
        int c = 0;

        boolean isOk = false;
        for (int i = 0; i < n + 1; i++) {
            a = i;
            for (int j = 0; j < n - i + 1; j++) {
                b = j;
                c = n - a - b;
                if (10000*a + 5000*b + 1000*c == y) {
                    isOk = true;
                    break;
                }
            }
            if (isOk) break;
        }
        if (!isOk) {
            a = -1;
            b = -1;
            c = -1;
        }

        System.out.print(a);
        System.out.print(" ");
        System.out.print(b);
        System.out.print(" ");
        System.out.println(c);
    }
}

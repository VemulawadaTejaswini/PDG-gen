import java.util.*;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if (a % 2 == 1 || b % 2 == 1 || c % 2 == 1) {
            System.out.println(0);
            return;
        }

        if (a == b && b == c) {
            System.out.println(-1);
            return;
        }

        int ans = 0;

        while (true) {
            ans++;
            int nA = b / 2 + c / 2;
            int nB = a / 2 + c / 2;
            int nC = a / 2 + b / 2;
            if (nA % 2 == 1 || nB % 2 == 1 || nC % 2 == 1) {
                System.out.println(ans);
                return;
            }
            a = nA;
            b = nB;
            c = nC;
        }
    }
}
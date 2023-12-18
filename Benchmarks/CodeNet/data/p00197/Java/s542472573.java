import java.util.Scanner;

public class Main {
    static int c;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for (;;) {
            int n = sc.nextInt(), m = sc.nextInt();
            if ((n | m) == 0)
                break;
            c=0;
            System.out.println(gcd(n, m)+" "+(c==1?1:c-1));

        }
    }

    static int gcd(int a, int b) {
        c++;
        return b % a == 0?a:gcd(b % a, a);
    }
}

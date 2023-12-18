import java.util.Scanner;

public class Main {
    static long n;
    static long a;
    static long b;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        a = sc.nextLong();
        b = sc.nextLong();
        int ans = -1;
        for (int i = 0; i < 10000; i++) {
            if (i*8/100 == a && i*10/100 == b) {
                ans = i;
                break;
            }
        }
        System.out.println(ans);
    }
}
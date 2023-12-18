import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = Long.parseLong(sc.next());
        long m = Long.parseLong(sc.next());
        long ans = 0;
        if (n * m == 1) {
            ans = 1;
        } else if (n == 1) {
            ans = m - 2;
        } else if (m == 1) {
            ans = n - 2;
        } else {
            ans = (n - 2) * (m - 2);
        }
        System.out.println(ans);
    }
}
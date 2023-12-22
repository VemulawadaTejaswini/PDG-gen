import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt(), B = sc.nextInt();
        long ans = 0;
        for (int n = A; n <= B; n++) {
            int d5 = (n / 10000) % 10;
            int d4 = (n /  1000) % 10;
            int d2 = (n /    10) % 10;
            int d1 =  n          % 10;
            if (d5 == d1 && d4 == d2) ans += 1;
        }
        System.out.println(ans);
        sc.close();
    }
}

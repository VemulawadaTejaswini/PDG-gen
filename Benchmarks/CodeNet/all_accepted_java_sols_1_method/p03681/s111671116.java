import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long m = sc.nextLong();
        long nn = 1l;
        for (int i = 2; i <= n; i++) {
            nn *= i;
            nn %= 1000000007l;
        }
        long mm = 1l;
        for (int i = 2; i <= m; i++) {
            mm *= i;
            mm %= 1000000007l;
        }
        long ans;
        if(Math.abs(n - m) > 1) {
            ans = 0l;
        } else if(n == m){
            ans = nn * mm * 2;
        } else {
            ans = nn * mm;
        }
        System.out.println(ans % 1000000007);
    }
}
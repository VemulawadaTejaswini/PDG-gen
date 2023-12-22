import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        long K = Long.parseLong(sc.next());
        long gosencho = 5000000000000000l;

        long cur = 0;
        for (int i = 0; i < s.length(); i++) {
            long n = s.charAt(i) - 48;
            cur += Math.pow(n, gosencho);
            if (cur >= K) {
                System.out.println(n);
                return;
            }
        }
    }
}

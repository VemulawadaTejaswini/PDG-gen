import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String N = sc.next();
        int cnt = 0;
        for (int i = N.length(); i > 0; i--) {
            if (i % 2 == 0) continue;
            if (i == N.length()) {
                cnt += Integer.parseInt(N) - Math.pow(10, i - 1) + 1;
            } else {
                cnt += 9 * Math.pow(10, i - 1);
            }
        }
        System.out.println(cnt);
        sc.close();
    }
}
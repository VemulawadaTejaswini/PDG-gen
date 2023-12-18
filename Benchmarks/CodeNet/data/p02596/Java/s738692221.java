import java.util.Scanner;

public class Main {

    public static final int MOD = 1000000007;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        String s = String.valueOf(n);
        char c = s.charAt(s.length() - 1);
        if (c != '1' && c != '3' && c != '7' && c != '9') {
            System.out.println(-1);
            return;
        }
        int cnt = 1;
        int num = 0;
        int i = 0;
        while(i <= 1000000) {
            num = (10 * num + 7) % n;
            if (num == 0) {
                System.out.println(cnt);
                return;
            }
            cnt++;
            i++;
        }
        System.out.println(-1);
    }
}
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String S = sc.next();

        int cnt = 0;
        if (S.length() == 0) {
            cnt = 1;
        }
        else {
            char old = S.charAt(0);

            for (int i=1; i<S.length(); i++) {
                char now = S.charAt(i);
                if (old == now) {
                    cnt++;
                    if (now == '1') {
                        old = '0';
                    }
                    else {
                        old = '1';
                    }
                }
                else {
                    old = S.charAt(i);
                }

            }
        }
        System.out.println(cnt);
    }
}

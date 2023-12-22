import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        String S = sc.next();

        int cnt = 0;
        int ans =0;

        for (int i = 0; i < n; i++) {
            if (S.charAt(i) == 'R') {
                cnt++;
            }
        }

        for (int i = 0; i < cnt; i++) {
            if (S.charAt(i) == 'W') {
                ans++;
            }

        }


        System.out.println(ans);

        sc.close();

        }

    }


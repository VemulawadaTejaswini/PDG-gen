import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // 第6回 ドワンゴからの挑戦状 予選 A - Falling Asleep

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        String[] s = new String[n];
        int[] t = new int[n];

        int ttl = 0;
        
        for (int i = 0; i < n; i++) {
            s[i] = sc.next();
            t[i] = sc.nextInt();
            ttl += t[i];
        }

        String x = sc.next();

        for (int i = 0; i < n; i++) {
            ttl -= t[i];
            if (s[i].equals(x)) {
                break;
            }
        }

        System.out.println(ttl);
    }
}
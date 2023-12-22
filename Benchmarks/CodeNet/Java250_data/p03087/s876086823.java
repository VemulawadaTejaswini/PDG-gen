import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] s1 = sc.nextLine().split(" ");
        int N = Integer.parseInt(s1[0]);
        int Q = Integer.parseInt(s1[1]);
        String S = sc.nextLine();

        // a[]の生成

        StringBuilder sb = new StringBuilder();

        int ss = 0;
        int[] s = new int[N + 1];
        for (int i = 1; i <= N; i++) {
            if (i - 2 < 0) {
                sb.append("");
            } else {
                sb.append(S.charAt(i - 2));
            }
            sb.append(S.charAt(i - 1));

            if (sb.toString().equals("AC")) {
                ss++;
            }
            s[i] = ss;
            sb.setLength(0);
        }

        // queryの処理
        for (int i = 0; i < Q; i++) {
            int l = sc.nextInt();
            int r = sc.nextInt();
            System.out.println(s[r] - s[l]);
        }

        sc.close();
    }

}

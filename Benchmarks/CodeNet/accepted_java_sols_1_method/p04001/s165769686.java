import java.util.Scanner;

public class Main {
    static String S;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        S = in.next();
        int len = S.length();
        long count = 0;
        int idx;
        String str;
        for (int i = 0; i < Math.pow(2, len - 1); i++) {
            idx = 0;
            // System.out.println("i:"+i);
            for (int j = 0; j < len - 1; j++) {
                if ((1 & i >> j) == 1) {
                    // System.out.println("i:" + i + ", j:" + j);
                    count += Long.parseLong(S.substring(idx, j + 1));
                    // System.out.println("count:" + count);
                    idx = j + 1;
                }
            }
            count += Long.parseLong(S.substring(idx));
            // System.out.println("count:" + count);
        }
        System.out.println(count);
    }
}
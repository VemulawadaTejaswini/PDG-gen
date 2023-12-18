import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 整数の入力
        int n = sc.nextInt();
        int[] num = new int[n];
        long cnt = 0;
        for (int i = 0; i < n; i++) {
            for (int i1 : new Integer[]{0, 1, 9}) {
                num[i] = i1;

                boolean e9 = false, e0 = false;
                for (int value : num) {
                    if (value == 9) {
                        e9 = true;
                    } else if (value == 0) {
                        e0 = true;
                    }

                    if (e9 && e0) {
                        break;
                    }
                }

                if (i1 == 1 && e9 && e0) {
                    cnt = ((cnt % ((long)Math.pow(10L, 9L) + 7L)) + 8L);
                } else if (e9 && e0) {
                    cnt = ((cnt % ((long)Math.pow(10L, 9L) + 7L)) + 1L);
                }
            }
        }

        System.out.print(cnt);
    }
}

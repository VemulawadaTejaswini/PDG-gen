import java.util.*;
import java.lang.Math;

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        String s = sc.next();

        int max = 0;

        for (int i = 0; i < n - 1; i++) {
            int cnt = 0;
            boolean isExist[] = new boolean[26];
            for (int j = 0; j < n; j++) {
                int index = (int)s.charAt(j) - (int)'a';
                if (j <= i) {
                    isExist[index] = true;
                } else {
                    if (isExist[index]) {
                        cnt++;
                        isExist[index] = false;
                    }
                }
            }
            if (max < cnt) {
                max = cnt;
            }
        }
        System.out.println(max);
    }
}

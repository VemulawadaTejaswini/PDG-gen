import java.util.*;

import static java.lang.System.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        int[] s = new int[N];
        for (int i = 0; i < N; i++) {
            s[i] = sc.nextInt();
        }

        int sum = 0;
        for (int i = 0; i < N; i++) {
            sum += s[i];
        }

        Arrays.sort(s);
        int i = 0;
        while (sum % 10 == 0) {
            // 全て10の倍数
            if(i >= s.length){
                sum = 0;
                break;
            }

            if (s[i] % 10 != 0) {
                sum -= s[i];
            }
            i++;
        }

        out.println(sum);
    }
}
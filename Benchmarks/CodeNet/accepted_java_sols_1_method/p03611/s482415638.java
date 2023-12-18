import java.util.*;

import static java.lang.System.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        int[] a = new int[N];
        for (int i = 0; i < N; i++) {
            a[i] = sc.nextInt();
        }

        int aNum = 100003;     // -1〜10^5+1 -> 0〜10^5+2
        int[] nums = new int[aNum];
        for (int i = 0; i < N; i++) {
            // 最小値を-1から0にする
            nums[a[i] + 2]++;
            nums[a[i]]++;
            nums[a[i] + 1]++;
        }

        int maxNum = 0;
        for (int i = 0; i < aNum; i++) {
            if (nums[i] > maxNum) {
                maxNum = nums[i];
            }
        }

        out.println(maxNum);
    }
}
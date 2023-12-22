import java.util.*;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        char[] s = sc.next().toCharArray();

        int ans = Integer.MAX_VALUE;
        int[] whiteCumulativeSum = new int[s.length];

        if (s[0] == '.') {
            whiteCumulativeSum[0]++;
        }

        for (int i = 1; i < s.length; i++) {
            whiteCumulativeSum[i] = whiteCumulativeSum[i - 1];
            if (s[i] == '.') {
                whiteCumulativeSum[i]++;
            }
        }

        if (whiteCumulativeSum[s.length - 1] == 0) {
            System.out.println(0);
            return;
        }

        for (int i = 0; i < s.length; i++) {
            // iまでを白にするコスト
            int whiteCost = i + 1 - whiteCumulativeSum[i];
            // iより奥を黒にするコスト
            int blackCost = whiteCumulativeSum[n - 1] - whiteCumulativeSum[i];
            ans = Math.min(ans, whiteCost + blackCost);
        }

        System.out.println(Math.min(ans, whiteCumulativeSum[n - 1]));
    }
}
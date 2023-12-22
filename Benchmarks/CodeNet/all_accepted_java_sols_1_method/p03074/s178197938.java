import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        char[] s = sc.next().toCharArray();
        List<Integer> one = new ArrayList<>();
        List<Integer> zero = new ArrayList<>();
        int oneCnt = 0;
        int zeroCnt = 0;
        if (s[0] == '1') {
            oneCnt++;
        } else {
            zeroCnt++;
            one.add(0);
        }
        for (int i = 1; i < n; i++) {
            if (s[i] == '1') {
                oneCnt++;
                if (zeroCnt != 0) {
                    zero.add(zeroCnt);
                    zeroCnt = 0;
                }
            } else {
                zeroCnt++;
                if (oneCnt != 0) {
                    one.add(oneCnt);
                    oneCnt = 0;
                }
            }
        }
        if (oneCnt != 0) {
            one.add(oneCnt);
        } else if (zeroCnt != 0) {
            zero.add(zeroCnt);
            one.add(0);
        }

        if (zero.isEmpty() || zero.size() == 1 && one.get(0) == 0 && one.get(1) == 0) {
            System.out.println(s.length);
            return;
        }
        long oneSum = 0;
        long zeroSum = 0;
        for (int i = 0; i < Math.min(k + 1, one.size()); i++) {
            oneSum += one.get(i);
        }
        for (int i = 0; i < Math.min(k, zero.size()); i++) {
            zeroSum += zero.get(i);
        }
        long ans = zeroSum + oneSum;
        for (int i = 1; i < zero.size() - k + 1; i++) {
            zeroSum += zero.get(i + k - 1) - zero.get(i - 1);
            oneSum += one.get(i + k) - one.get(i - 1);
            ans = Math.max(zeroSum + oneSum, ans);
        }
        System.out.println(ans);
    }

}

import java.util.*;
public class Main {
    public static void main(String[] args) {
        int minNow = Integer.MAX_VALUE;
        int maxValue = Integer.MIN_VALUE;
        int n, i, r;
        Scanner cin = new Scanner(System.in);
        n = cin.nextInt();
        for (i = 0; i < n; i++) {
            r = cin.nextInt();
            maxValue = Integer.max(maxValue, r - minNow);
            minNow = Integer.min(minNow, r);
        }
        System.out.println(maxValue);
    }
}

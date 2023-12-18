import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int w = sc.nextInt();
        int h = sc.nextInt();
        int n = sc.nextInt();
        int prevW = sc.nextInt();
        int prevH = sc.nextInt();
        long total = 0;
        for (int i = 1; i < n; i++) {
            int curW = sc.nextInt();
            int curH = sc.nextInt();
            if ((prevW < curW && prevH < curH) || (prevW > curW && prevH > curH)) {
                int max = Math.max(Math.abs(curW - prevW), Math.abs(curH - prevH));
                total += max;
            } else {
                total += Math.abs(curW - prevW) + Math.abs(curH - prevH);
            }
            prevW = curW;
            prevH = curH;
        }
        System.out.println(total);
    }
}

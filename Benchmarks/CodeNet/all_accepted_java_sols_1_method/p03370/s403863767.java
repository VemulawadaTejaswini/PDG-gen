import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        int powder = Integer.parseInt(sc.next());
        int min = Integer.MAX_VALUE;
        int cnt = 0;
        for (int i = 0; i < n; i++) {
            int donuts =Integer.parseInt(sc.next());
            powder -= donuts;
            min = Math.min(min, donuts);
            cnt++;
        }
        if (powder > 0) {
            while (powder - min >= 0) {
                powder -= min;
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}
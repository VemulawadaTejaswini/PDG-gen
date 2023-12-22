import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        int x = Integer.parseInt(sc.next());
        int[] times = new int[n];
        for (int i = 0; i < n; i++) {
            times[i] = Integer.parseInt(sc.next());
        }
        int cnt = 0;
        int bound = 0;
        for (int i = 0; i < n; i++) {
            bound += times[i];
            if (bound > x) break;
            else {
                cnt++;
            }
        }
        System.out.println(1 + cnt);
    }
}

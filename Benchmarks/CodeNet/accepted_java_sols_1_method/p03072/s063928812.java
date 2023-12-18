import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        int[] mount = new int[n];
        for (int i = 0; i < n; i++) {
            mount[i] = Integer.parseInt(sc.next());
        }
        int cnt = 0;
        for (int i = 0; i < n; i++) {
            boolean taller = true;
            for (int j = 0; j < i; j++) {
                if (mount[j] > mount[i]) {
                    taller = false;
                    break;
                }
            }
            if (taller) {
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}
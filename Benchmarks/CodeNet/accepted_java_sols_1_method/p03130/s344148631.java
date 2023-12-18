import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] way = new int[6];
        int[] set = new int[4];
        for (int i = 0; i < 6; i++) {
            way[i] = sc.nextInt();
            set[way[i] - 1]++;
        }
        boolean ans = true;
        int flag = 0;
        sc.close();
        for (int i = 0; i < 4; i++) {
            if (set[i] == 0) {
                ans = false;
            }
            if (set[i] == 1) {
                flag++;
            }
            if (flag > 2) {
                ans = false;
            }
        }
        System.out.println(ans ? "YES" : "NO");
    }
}

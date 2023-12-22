import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int alice_start = Integer.parseInt(sc.next());
        int alice_end = Integer.parseInt(sc.next());
        int bob_start = Integer.parseInt(sc.next());
        int bob_end = Integer.parseInt(sc.next());
        int[] alice = new int[100];
        int[] bob = new int[100];
        for (int i = 0; i < 100; i++) {
            if (i >= alice_start && i < alice_end) {
                alice[i] = 1;
            }
            if (i >= bob_start && i < bob_end) {
                bob[i] = 1;
            }
        }
        int cnt = 0;
        for (int i = 0; i < 100; i++) {
            if (alice[i] == 1 && bob[i] == 1) cnt++;
        }
        System.out.println(cnt);
    }
}

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] c = new int[4];
        for (int i = 0; i < 3; i++) {
           c[sc.nextInt() - 1]++;
           c[sc.nextInt() - 1]++;
        }
        // その街から出ている道の数が偶数か奇数か
        // 奇数2なら可能
        int o = 0;
        for (int i = 0; i < 4; i++) {
            if ((c[i] & 1) == 1) o++;
        }
        System.out.println((o == 2) ? "YES" : "NO");
    }
}
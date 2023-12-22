import java.lang.reflect.Array;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), m = sc.nextInt();
        int ans[] = new int[n];
        for (int i = 0; i < m; i++) {
            int a = sc.nextInt(), b = sc.nextInt();
            ans[a - 1] += 1;
            ans[b - 1] += 1;
        }
        for (Integer c:ans) System.out.println(c);
    }
}

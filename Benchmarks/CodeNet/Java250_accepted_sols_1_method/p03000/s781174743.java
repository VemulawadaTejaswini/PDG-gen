import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), x = sc.nextInt();
        int cnt = n <= x ? 1 : 0, cur = 0, temp;
        for (int i = 0; i < n; ++i) {
            temp = sc.nextInt();
            cur += temp;
            if (cur <= x) ++cnt;
        }
        System.out.printf("%d\n", cnt);
    }
}
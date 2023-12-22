import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        int l = Integer.parseInt(sc.next());

        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += l + i;
        }

        int res = Integer.MAX_VALUE;
        int v = 0;
        for (int i = 0; i < n; i++) {
            int tmp = sum - (l + i);
            if (res > Math.abs(sum - tmp)) {
                res = Math.abs(sum - tmp);
                v = (l + i);
            }
        }
        System.out.println(sum - v);
    }
}

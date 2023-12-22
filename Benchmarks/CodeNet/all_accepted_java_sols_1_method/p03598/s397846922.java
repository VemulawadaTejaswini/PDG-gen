import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        int k = Integer.parseInt(sc.next());
        int ans = 0;
        for (int i = 0; i < n; i++) {
            int x = Integer.parseInt(sc.next());
            int num = Math.min(Math.abs(k - x), x);
            ans += num * 2;
        }
        System.out.println(ans);
    }
}
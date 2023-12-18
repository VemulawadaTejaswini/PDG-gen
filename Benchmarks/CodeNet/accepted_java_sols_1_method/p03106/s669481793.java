import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = Integer.parseInt(sc.next());
        int b = Integer.parseInt(sc.next());
        int k = Integer.parseInt(sc.next());
        int cnt = 0;
        int ans = 0;
        for (int i = Math.min(a, b); i >= 0; i--) {
            if (a % i == 0 && b % i == 0) {
                cnt++;
                if (cnt == k) {
                    ans = i;
                    break;
                }
            }
        }
        System.out.println(ans);
    }
}
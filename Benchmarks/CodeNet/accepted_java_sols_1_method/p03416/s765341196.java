import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt(), B = sc.nextInt();
        long ans = 0; //abcba
        for (int a = 1; a <= 9; a++) {
            for (int b = 0; b <= 9; b++) {
                for (int c = 0; c <= 9; c++) {
                    int n = 10000 * a + 1000 * b + 100 * c + 10 * b + a;
                    if (A <= n && n <= B) ans += 1;
                }
            }
        }
        System.out.println(ans);
        sc.close();
    }
}

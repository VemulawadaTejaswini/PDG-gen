import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        double bunbo = 0;
        int a = 1;
        while (a < k) {
            a *= 2;
            bunbo += 1;
        }
        double bunshi = 1;
        for (int i = 2; i < n + 1; i++) {
            int count = 0;
            int j = i;
            while (j < k) {
                j *= 2;
                count += 1;
            }
            bunshi += Math.pow(2, bunbo - count);
        }
        System.out.println(bunshi / (Math.pow(2, bunbo) * n));
    }
}
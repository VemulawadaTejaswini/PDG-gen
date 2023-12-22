import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int res = Integer.MAX_VALUE;
        int n = sc.nextInt();
        int[] AS = new int[n + 1];
        AS[0] = 0;
        for(int i = 1; i <= n; i++) {
            AS[i] = AS[i-1] +  sc.nextInt();
        }
        for(int i = 1; i < n; i++) res = Math.min(res, Math.abs(2 * AS[i] - AS[n]));
        System.out.println(res);
    }
}

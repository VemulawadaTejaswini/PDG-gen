import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] p = new int[n];
        for (int i = 0; i < p.length; i++) {
            p[i] = sc.nextInt();
        }
        int a = n / 2 - 1;
        Arrays.sort(p);
        int ans = p[a + 1] - p[a];
        System.out.println(ans);
    }
}
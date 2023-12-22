import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] v = new int[n];
        for (int i = 0; i < n; i++) {
            v[i] = sc.nextInt();
        }
        Arrays.sort(v);
        double v0 = v[0];
        for (int i = 1; i < n; i++) {
            v0 = (v0 + v[i]) / 2;
        }
        System.out.println(v0);
    }
}

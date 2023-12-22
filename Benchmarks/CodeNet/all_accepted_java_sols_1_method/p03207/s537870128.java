import java.util.*;
import java.lang.*;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int p[] = new int[n];
        for (int i = 0; i < n; i++) {
            p[i] = sc.nextInt();
        }
        Arrays.sort(p);
        int sum = 0;
        sum += p[n - 1] / 2;
        for (int i = 0; i < n - 1; i++) {
            sum += p[i];
        }
        System.out.println(sum);
    }
}
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = sc.nextInt();
        int[] l = new int[n+2];
        l[0] = 0;
        for (int i = 1; i <= n; i++) {
            l[i] = sc.nextInt();
            l[i] += l[i-1];
        }
        l[n+1] = Integer.MAX_VALUE;
        int ans = 0;
        while(l[ans] <= x) {
            ans++;
        }
        System.out.println(ans);
    }
}
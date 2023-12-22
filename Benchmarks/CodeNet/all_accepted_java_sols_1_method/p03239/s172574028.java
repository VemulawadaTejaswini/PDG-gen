import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int T = sc.nextInt();
        int[] c = new int[n];
        int[] t = new int[n];
        int min = Integer.MAX_VALUE;
        int ans = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            c[i] = sc.nextInt();
            t[i] = sc.nextInt();
            if(T >= t[i]) {
                ans = Math.min(ans, c[i]);
            }
        }
        if(ans == Integer.MAX_VALUE) System.out.println("TLE");
        else System.out.println(ans);
    }
}
import  java.util.*;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int t = sc.nextInt();

        int[] c = new int[n];

        int cnt = 0;
        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();

            if (y <= t)
                c[cnt++] = x;
        }

        int min = c[0];
        for (int i = 1; i < cnt; i++) {
            min = Math.min(min, c[i]);
        }

        System.out.println(min > 0 ? min : "TLE");
    }
}

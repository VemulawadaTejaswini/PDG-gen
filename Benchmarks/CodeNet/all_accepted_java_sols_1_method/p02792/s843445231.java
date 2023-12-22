import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] a = new int[10][10];
        for (int i = 1; i <= n; i++) {
            String s = String.valueOf(i);
            int x = Integer.parseInt(s.substring(0,1));
            int y = Integer.parseInt(s.substring(s.length()-1,s.length()));
            a[x][y]++;
        }
        int ans = 0;
        for (int i = 1; i <= n; i++) {
            String s = String.valueOf(i);
            int x = Integer.parseInt(s.substring(0,1));
            int y = Integer.parseInt(s.substring(s.length()-1,s.length()));
            ans += a[y][x];
        }
        System.out.println(ans);
        sc.close();

    }

}

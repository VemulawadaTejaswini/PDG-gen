import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        int maxL = 0;
        int minr = 100000;
        for (int i = 0; i < m; i++) {
            int l = sc.nextInt();
            int r = sc.nextInt();

            maxL = Math.max(maxL, l);
            minr = Math.min(minr, r);
        }
        
        int ans = 0;
        if (minr - maxL >= 0)
            ans = minr - maxL + 1;
        
        System.out.println(ans);
    }
}
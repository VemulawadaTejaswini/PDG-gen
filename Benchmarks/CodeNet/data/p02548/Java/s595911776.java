import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        long ans = 0;
        for(int a=1; a<n; a++) {
            int maxb = maxb(a, n);
            ans += maxb;
        }
        System.out.println(ans);
    }
    private static int maxb(int a, int n) {
        // a*b < n となる最大のbを探す
        int maxb = n/a;
        if(a*maxb >= n) {
            maxb--;
        }
        else if(a*(maxb+1)<n) {
            // 無い気がするけど、一応
            maxb++;
        }
        return maxb;
    }
}

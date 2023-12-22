import java.util.*;
public class Main {
    static final long MODVAL = 998244353L;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int X = sc.nextInt();
        int Y = sc.nextInt();
        int count[] = new int[N];
        X--;
        Y--;
        for(int i=0; i<N-1; i++) {
            for(int j=i+1; j<N; j++) {
//                System.out.println(String.format("%d:%d", i, j));
                // 直接到達：j-i
                // XからYへ抜ける： |i-x| + 1 + |j-Y|
                // YからXへ抜ける： |i-Y| + 1 + |j-X|
                int p1 = j-i;
                int p2 = Math.abs(i-X) + 1 + Math.abs(j-Y);
                int p3 = Math.abs(i-Y) + 1 + Math.abs(j-X);
                int best = Math.min(Math.min(p1, p2), p3);
                count[best]++;
            }
        }
        for(int t=1; t<N; t++) {
            System.out.println(count[t]);
        }
    }
}

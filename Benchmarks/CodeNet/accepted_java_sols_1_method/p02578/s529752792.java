import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        long[] ai = new long[n];
        for(int i=0; i<n; i++) {
            ai[i] = in.nextLong();
        }
        long ans = 0;
        for(int i=1; i<n; i++) {
            if(ai[i] < ai[i-1]) {
                ans += ai[i-1] - ai[i];
                ai[i] = ai[i-1];
            }
        }
        System.out.println(ans);
    }
}

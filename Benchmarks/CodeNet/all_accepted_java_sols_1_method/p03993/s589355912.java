import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] r = new int[n];
        boolean[] p = new boolean[n];
        for(int i= 0; i < n; i++) {
            r[i] = in.nextInt() - 1;
        }
        int ans = 0;
        for(int i = 0; i < n; i++) {
            if(!p[i] && i == r[r[i]]) {
                p[i] = p[r[i]] = true;
                ans++;
            }
        }
        System.out.println(ans);
    }
}

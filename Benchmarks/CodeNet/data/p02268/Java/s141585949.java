import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] S = new int[n];
        for(int i = 0; i < n; i++) S[i] = Integer.parseInt(sc.next());
        int q = sc.nextInt();
        int ans = 0;
        label:
        for(int i = 0; i < q; i++) {
            int t = Integer.parseInt(sc.next());
            int l = 0;
            int u = n-1;
            while(l <= u) {
                int m = (l + u) / 2;
                if(S[m] == t) {
                    ans++;
                    continue label;
                }
                if(S[m] < t) l = m+1;
                else u = m-1;
            }
        }
        System.out.println(ans);
    }
}

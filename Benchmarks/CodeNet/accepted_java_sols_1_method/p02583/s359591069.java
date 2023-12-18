import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[] L = new long[n];
        for (int i = 0; i < n; i++) {
            L[i] = sc.nextLong();
        }
        int ans = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < n; j++) {
                if(L[i] == L[j])continue;
                long longer = Math.max(L[i], L[j]);
                long rest1 = Math.min(L[i], L[j]);
                for (int k = j+1; k < n; k++) {
                    if(L[i] == L[k] || L[j] == L[k])continue;
                    long longest = Math.max(longer, L[k]);
                    long rest2 = Math.min(longer, L[k]);
                    if(rest1 + rest2 > longest) ans++;
                }
            }
        }
        System.out.println(ans);
        sc.close();

    }

}

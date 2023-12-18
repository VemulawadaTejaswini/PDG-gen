import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] hl = new int[n];
        for(int i = 0; i < n; i++){
            hl[i] = sc.nextInt();
        }
        Arrays.sort(hl);
        int ans = Integer.MAX_VALUE;
        for(int i = 0; i <= n-k; i++){
            ans = Math.min(ans, hl[i+k-1]-hl[i]);
        }
        System.out.println(ans);
    }
}

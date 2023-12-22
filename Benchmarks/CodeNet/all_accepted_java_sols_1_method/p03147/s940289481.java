import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] h = new int[N];

        h[0] = sc.nextInt();
        int ans = h[0];
        for(int i = 1; i < N; i++){
            h[i] = sc.nextInt();
            if(h[i-1] >= h[i]) continue;
            ans += h[i] - h[i-1];
        }
        
        System.out.println(ans);
    }
}

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.next());

        boolean ans = true;
        int v = 0;
        
        long[] h = new long[N];
        h[0] = Long.parseLong(sc.next());
        for(int i = 1; i < N; i++) {
            h[i] = Long.parseLong(sc.next());
        }
        
        for(int i = N-1; i >= 1; i--) {
            if(h[i] >= h[i-1]) {
                continue;
            }else if(h[i] - h[i-1] == -1) {
                h[i-1]--;
            }else {
                ans = false;
                break;
            }
        }
        
        if(ans) {
            System.out.println("Yes");
        }else {
            System.out.println("No");
        }
    }
}
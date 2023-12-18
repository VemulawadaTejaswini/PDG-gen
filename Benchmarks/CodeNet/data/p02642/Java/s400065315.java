import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] minfactor = new int[101];
        boolean[] ng = new boolean[101];
        for (int i = 0; i < n; i++) {
            int num = sc.nextInt();
            if (minfactor[num] == 0) {
                minfactor[num] = num;
            } else {
                ng[num] = true;
            }
        }
        
        int ans = 0;
        for (int i = 1; i < 101; i++) {
            if (minfactor[i] == i) {
                if (!ng[i]) ans ++;
                
                for (int j = i; j < 101; j += i) {
                    minfactor[j] = i;
                }
            }
        }
        System.out.println(ans);
    }
}

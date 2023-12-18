import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        String str = sc.next();
        char array[] = str.toCharArray();
        
        int[] ans = new int[100005];
        
        int idx = n;
        int k = 0;
        while (true) {
            boolean ok = false;
            for (int j = idx - m; j < idx; j++) {
                if (j < 0) continue;
                if (array[j] == '0') {
                    ans[k] = idx - j;
                    idx = j;
                    k++;
                    ok = true;
                    break;
                }
            }
            
            if (idx == 0) break;
            
            if (!ok) {
                System.out.println(-1);
                return;
            }
        }
        
        for (int i = k - 1; i >= 0; i--) {
            System.out.print(ans[i]);
            
            if (i != 0) {
                System.out.print(" ");
            } else {
                System.out.println();
            }
        }
    }
}

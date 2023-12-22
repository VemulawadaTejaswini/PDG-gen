import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] h = new int[n + 1];
        for (int i = 0; i < n; i++) {
            h[i] = sc.nextInt();
        }
        h[n] = 0;
        
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (h[i] == 0) continue;
            int min = h[i];
            
            for (int j = i + 1; j <= n; j++) {
                if (h[j] != 0) {
                    min = Math.min(min, h[j]);
                } else {
                    for (int k = i; k <= j - 1; k++) {
                        h[k] -= min;
                    }
                    count += min;
                    if (h[i] != 0) {
                        i--;
                    }
                    break;
                }
            }
        }
        
        System.out.println(count);
    }
}

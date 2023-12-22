import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] count = new int[100001];
        while (n-- > 0) {
            int num = sc.nextInt();
            if (num != 0) count[num-1]++;
            count[num]++;
            if (num != 100000) count[num+1]++;
        }
        
        int ans = 0;
        for (int i = 0; i < 100001; i++) {
            ans = Math.max(ans, count[i]);
        }
        System.out.println(ans);
    }
}

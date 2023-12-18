import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        
        int[] digit = new int[n];
        Arrays.fill(digit, -1);
        
        for (int i = 0; i < m; i++) {
            int s = sc.nextInt() - 1;
            int c = sc.nextInt();
            
            if (digit[s] == -1) {
                digit[s] = c;
            } else if (digit[s] != c) {
                System.out.println(-1);
                return;
            }
        }
        
        if (n != 1 && digit[0] == -1) {
            digit[0] = 1;
        }
        
        if (n != 1 && digit[0] == 0) {
            System.out.println(-1);
            return;
        }
        
        for (int i = 0; i < n; i++) {
            if (digit[i] == -1) {
                digit[i] = 0;
            }
        }
        
        for (int i = 0; i < n; i++) {
            int num = digit[i];
            System.out.print(num);
        }
        System.out.println();
    }
}

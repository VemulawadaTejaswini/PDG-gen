import java.util.*;

public class Main {
    private static Scanner scanner;

    public static int[] inputIntArray(int n) {
        int[] res = new int[n];
        for (int i = 0; i < n; ++i) {
            res[i] = scanner.nextInt();
        }

        return res;
    }

    public static void main(String args[]) {
        scanner = new Scanner(System.in);
           
        int n = scanner.nextInt();
        
        int[] a = new int[n];
        
        for(int i = 0; i < n; ++i) {
            a[i] = i + 1;
        }
        
        int m = scanner.nextInt();
        
        for(int i = 0; i < m; ++i) {
            int lh, rh;
            
            String[] arr = scanner.next().split(",", -1);
            
            lh = Integer.parseInt(arr[0]) - 1;
            rh = Integer.parseInt(arr[1]) - 1;
            
            a[lh] = a[lh] ^ a[rh];
            a[rh] = a[lh] ^ a[rh];
            a[lh] = a[lh] ^ a[rh];
        }
        
        for(int i = 0; i < n; ++i) {
            System.out.println(a[i]);
        }
    }
}

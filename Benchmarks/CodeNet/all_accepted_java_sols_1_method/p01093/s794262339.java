import java.util.*;

public class Main {
    public static int[] goals = {5, 7, 5, 7, 7};
    
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        
        while (true) {
            int N = sc.nextInt();
            if (N == 0) break;
            
            int[] arr = new int[N];
            for (int i = 0; i < N; i++) {
                arr[i] = sc.nextInt();
            }
            
            int min = 9999999;
            
            Arrays.sort(arr);
            for (int i = 1; i < N; i++) {
                // System.out.println(arr[i-1]);
                min = Math.min(min, Math.abs(arr[i] - arr[i-1]));
            }
            
            // for (int x : arr) {
            //     System.out.println(x);
            // }
            
            System.out.println(min);
        }
    }
}



import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        
        while (true) {
            int N = in.nextInt();
            int L = in.nextInt();
            if (N == 0 && L == 0) break;
            
            int[] arr = new int[N];
            for (int i = 0; i < N; i++) {
                arr[i] = in.nextInt();
            }
            
            int max = -999;
            for (int i = 0; i < N; i++) {
                for (int j = i + 1; j < N; j++) {
                    if (arr[i] + arr[j] <= L)
                        max = Math.max(max, arr[i] + arr[j]);
                } 
            }
            
            if (max < 0) System.out.println("NONE");
            else System.out.println(max);
        }
    }
}


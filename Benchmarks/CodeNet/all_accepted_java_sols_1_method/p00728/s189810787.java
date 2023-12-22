import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        // int TC = Integer.parseInt(sc.next(), 10);
        
        while (true) {
            int N = sc.nextInt();
            if (N == 0) break;
            int[] arr = new int[N];
            for (int i = 0; i < N; i++) {
                arr[i] = sc.nextInt();
            }
            Arrays.sort(arr);
            int total = 0;
            for (int i = 1; i < N - 1; i++) {
                total += arr[i];
            }
            System.out.println(total / (N-2));
        }
    }
    
}



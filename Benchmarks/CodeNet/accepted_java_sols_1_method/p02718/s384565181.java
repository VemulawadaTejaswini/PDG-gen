import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int[] A = new int[N];
        int total = 0;
        double kijun = 1 / (double)(4 * M);
        
        //Aに格納
        for(int i = 0; i < N; i++){
            A[i] = sc.nextInt();
            total += A[i];
        }
        
        //昇順にソート
        int maxidx = 0;
        int w = 0;
        for(int i = 0; i < N; i++){
            maxidx = i;
            w = A[i];
            for(int j = i+1; j < N; j++) {
                if(A[maxidx] < A[j]) {
                    maxidx = j;
                }
            }
            A[i] = A[maxidx];
            A[maxidx] = w;
        }
        
        //判定
        String ans = "Yes";
        for(int i = 0; i < M; i++) {
            if(A[i] < kijun * total) {
                ans = "No";
            }
        }
        
        System.out.println(ans);
        
    }
}

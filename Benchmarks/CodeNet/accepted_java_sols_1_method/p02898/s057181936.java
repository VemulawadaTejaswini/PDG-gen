import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
         //値の取得
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        int[] h = new int[N];
        
        int count = 0;
        
        for (int i = 0; i < N; ++i){
            h[i] = sc.nextInt();
            if (h[i] >= K){
                ++count;
            }
        }
        
        System.out.println(count);
        
    }
}
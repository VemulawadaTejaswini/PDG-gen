import java.util.*;
public class Main {
    
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int K = scanner.nextInt();
        int[] nus = new int[N];
        for (int i = 0; i < K; i++) {
            int d = scanner.nextInt();
            for (int j = 0; j < d; j++) {
                int a = scanner.nextInt() - 1;
                nus[a] ++;
            }
        }
        int res = 0;
        for (int i = 0; i < N; i++) {
            if(nus[i] == 0){
                res++;
            }
        }
        System.out.println(res);
    }
}
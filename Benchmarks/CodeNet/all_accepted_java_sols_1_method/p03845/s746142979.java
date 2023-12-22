import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int T[] = new int[N];
        int total = 0;
        for(int i = 0;i < N;i++){
            T[i] = sc.nextInt();
            total += T[i];
        }
        
        int M = sc.nextInt();
        for(int i = 0; i < M;i++){
           int p = sc.nextInt();
           int x = sc.nextInt();
           
           System.out.println(total - (T[p - 1] - x));
        }
        
    }
}

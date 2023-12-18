import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        //値を取得
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int T = 0;
        
        int answer = 0;
        for (int i = 1; i < N; ++i){
            if (T >= N){
                answer = (T - N);
                System.out.println(answer);
                System.exit(0);
                
            }
            T = 1000 * i;
        }
        
        
    }
}
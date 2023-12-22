import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        //値を取得
        Scanner sc = new Scanner(System.in);
        int H = sc.nextInt();
        int N = sc.nextInt();
        int[] A = new int[N];   //必殺技
        for (int i = 0; i < N; ++i){
            A[i] = sc.nextInt();
        }
        
        int HP = H;  //残り体力
        
        for (int i = 0; i < N; ++i){
            HP -= A[i];
            
            if(HP <= 0){
                System.out.println("Yes");
                System.exit(0);
            }
        }

        System.out.println("No");
    }
    
}
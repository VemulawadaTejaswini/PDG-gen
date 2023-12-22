import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        
        // Your code here!
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] T = new int[N + 1];
        int[] X = new int[N + 1];
        int[] Y = new int[N + 1];        
        
        T[0] = 0;
        X[0] = 0;
        Y[0] = 0;
        
        for(int i = 1 ; i < N + 1 ; i++){
            T[i] = sc.nextInt();
            X[i] = sc.nextInt();
            Y[i] = sc.nextInt();
        }
        
        for(int i = N  ; i > 0 ; i--){
            int needT = T[i] - T[i - 1];
            int needP = Math.abs(X[i] - X[i - 1]) + Math.abs(Y[i] - Y[i - 1]);
            //時間が余っていなければアウト
            if(needT < needP){
                break;
            }
            //つぶせる時間は偶数である
            if((needT - needP) % 2 == 1){
                break;
            }
            System.out.println("Yes");
            return;
            
        }
        System.out.println("No");
        
    }
}

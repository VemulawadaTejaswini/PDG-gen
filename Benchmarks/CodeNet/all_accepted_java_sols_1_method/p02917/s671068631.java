import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        //値を取得
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] B = new int[N-1];
        for (int i = 0; i < (N-1); ++i){
            B[i]= sc.nextInt();
        }
        
        //加算
        int sum = B[0] + B[N-2];
        for (int i = 0; i < (N-2); ++i){
            sum += Math.min(B[i],B[i+1]);
        }
        
        //出力
        System.out.println(sum);
        
    }
}
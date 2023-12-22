import java.util.*;
 
public class Main {
    public static void main(String[] args) throws Exception {
        //入力
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
      	//Bの配列格納
        int[] B = new int[N-1];
        for (int i = 0; i < (N-1); ++i){
            B[i]= sc.nextInt();
        }
        
        int sum = B[0] + B[N-2];
      	
        for (int i = 0; i < (N-2); ++i){
          	//比較して小さい方を加算
            sum += Math.min(B[i],B[i+1]);
        }
        
        //出力
        System.out.println(sum);
        
    }
}
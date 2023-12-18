import java.util.*;

public class Main{
    /*標準入力
    n
    a_1 a_2 a_3 ... a_n
    */
    public static void main(String[] args){
        //入力部分
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        int[] I = new int[N];
        for(int i=0;i<N;i++){
            I[i] = sc.nextInt();
        }
      
        //左端から自分まで、自分を使った場合の最大値を記録していく。
        
        int[] J = new int[N];
        J[0] = 1;
        for(int i = 1; i<N; i++){
        	//左に遡っていき、自分と距離K内にある数値まで行く。
            int left = i-1;
            int res = 0;
            while(left >= 0){
                if(Math.abs(I[left]-I[i]) <= K){
                  res = Math.max(res,J[left]);
                }
            	left--;
            }
            
          	//res = 0 なら1
            if(res == 0){
            	J[i] = 1;
            }
            else{
            	J[i] = res + 1;
            }
        }
      
      	//最大値
      	int ans = 0;
        for(int i = 0; i<N; i++){
        	ans = Math.max(J[i],ans);
        }
        //出力部分
        System.out.print(ans);
        sc.close();

    }
}

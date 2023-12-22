import java.util.*;

public class Main{
	public static void main(String args[]){
    	Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();

        int[] base_a = new int[N]; // 0 or 1
        int[] ball_b = new int[N]; // 0 or 1
        for(int i = 0; i < N; i++){
            base_a[i] = scanner.nextInt();
            ball_b[i] = 0;
        }
      
       /*
       * 最後の箱(Nコ目)の余り計算は、以下の箱のボールの個数に依存しない
       * そのため、最後の箱から余りを考えていくのが良さそう(-1にはならない？)
       */
       for(int i = N-1; i >= 0; i--){
           
           // iの倍数の箱のボールの合計
           int total_b = 0; 
           for(int j = i; j < N; j += i+1){
                total_b += ball_b[j];
           }
           
         //ボールを入れる条件
           if(base_a[i] == 1 && total_b % 2 == 0){
               ball_b[i] = 1;
           } else if(base_a[i] == 0 && total_b % 2 == 1){
               ball_b[i] = 1;
           }
       }
       
       //出力準備
       int count_b = 0;
       for(int i = 0; i < N; i++){
           if(ball_b[i] == 1){
               count_b++;
           }
       }
       System.out.print(count_b);

       System.out.println("");

       for(int i = 0; i < N; i++){
           if(ball_b[i] == 1){
               System.out.print(i+1 + " ");
           }
       }
    }
}
import java.util.*;

public class Main{
	public static void main(String args[]){
    	Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
      
        int[] A = new int[N];
        int[] a = new int[N];
        for(int i = 0; i < N; i++){
            A[i] = scanner.nextInt();
            a[i] = A[i];
        }
		
        int max_first = 0;
        int max_second = 0;
        int max_first_position = 0;
        
        /*
        * 1つ目の最大値の箇所のみ2つ目の最大値を出力。他は最大値を出力。
        * 2つ目の最大値 = 最大値　の可能性もある。
        */
      
        //1つ目の最大値探索
        for(int i = 0; i < N; i++){
            if(A[i] > max_first){
                max_first = A[i];
                max_first_position = i;
            }
        }
      
        a[max_first_position] = 0; //a配列では、1つ目の最大値の箇所を0にする
        
        //2つ目の最大値探索
        for(int i = 0; i < N; i++){
            if(a[i] > max_second){
                max_second = a[i];
            }
        } 
      
        for(int i = 0; i < N; i++){  
            if(a[i] == 0){
                System.out.println(max_second);
            } else {
                System.out.println(max_first);
            }
        } 
    }
}
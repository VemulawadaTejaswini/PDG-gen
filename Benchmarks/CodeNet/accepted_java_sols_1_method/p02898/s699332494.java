import java.util.*;

public class Main{
	public static void main(String args[]){
		
        Scanner sc = new Scanner(System.in);
        
      // 整数の取得
        int N = sc.nextInt();
        int K = sc.nextInt();
		int array[] = new int[N];
      
      for(int i = 0; i < N; i++){
      	array[i] = sc.nextInt();
      }

      
      //判定
      int cnt = 0;
      for(int i = 0; i < N; i++){
      	if(array[i] >= K){
        	cnt++;
        }
      }
      
      System.out.println(cnt);
    }
}
import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力(スペース改行関係なし)
		int n = sc.nextInt();
		int k = sc.nextInt();
        int kaisuu = 0;
		long list[] = new long[n];

      	for(int i = 0; i < n ; i ++){
        	list[i] = sc.nextLong();
        }
      
        for(int i = k; i < n ; i ++){
        	long mae = 1;
            long ato = 1;
          
          
          for(int j = k; j > 0 ; j--){
          	mae = mae * list[j + kaisuu -1];
          }
          
          for(int l = k; l > 0 ; l--){
          	ato = ato * list[l + kaisuu];
          }

          if(mae < ato){
          	System.out.println("Yes");
          }else{
          	System.out.println("No");
          }

          	kaisuu++;
        }
		
	}
}
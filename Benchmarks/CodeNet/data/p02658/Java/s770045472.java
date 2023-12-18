import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力(スペース改行関係なし)
		int n = sc.nextInt();
        long sum = 1;
      
        for(int i = 0 ; i < n  ; i++){
          int temp = sc.nextInt();
          sum = sum * temp;
        }


		if(sum <= 1000000000000000000){
			// 出力
			System.out.println(sum);
		}else{
			System.out.println(-1);
		}
		
	}
}
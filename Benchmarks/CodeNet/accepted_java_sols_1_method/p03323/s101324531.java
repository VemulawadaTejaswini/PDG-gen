import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

		public static void main(String[] args){

			Scanner sc = new Scanner(System.in);
			// 整数の入力
			// スペース区切りの整数の入力
			int A = sc.nextInt();
			int B = sc.nextInt();
			
			if((A<=8)&(B<=8)){
       		// 出力
				System.out.println("Yay!");
				return ;
			}else{
	       		// 出力
					System.out.println(":(");
					return ;
			}
		}
}

import java.util.Scanner;

public class Main {

		public static void main(String[] args){
			Scanner sc = new Scanner(System.in);
			// 整数の入力
			int X = sc.nextInt();
			int t = sc.nextInt();
			
			int ans = X - t;
			if (ans > 0){
	       		// 出力
	        	System.out.println(ans);
			}else{
	       		// 出力
	        	System.out.println(0);
			}
		}

}

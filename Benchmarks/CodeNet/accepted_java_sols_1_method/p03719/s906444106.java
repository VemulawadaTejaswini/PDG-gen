import java.util.Scanner;

public class Main {

		public static void main(String[] args){
			Scanner sc = new Scanner(System.in);
			// 整数の入力
			// スペース区切りの整数の入力
			int a = sc.nextInt();
			int b = sc.nextInt();
			int c = sc.nextInt();
            if((-100 > a)|(-100 > b)){
    			// 出力
    			System.out.println("Err1");
    			return;
            }
            if(c > 100){
    			// 出力
    			System.out.println("Err2");
    			return;
            }          
            if((a <= c) & (c <= b)){
    			// 出力
    			System.out.println("Yes");
            }else{
    			// 出力
    			System.out.println("No");            	
            }

		}
}

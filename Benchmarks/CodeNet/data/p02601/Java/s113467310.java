import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int a = sc.nextInt();
		// スペース区切りの整数の入力
		int b = sc.nextInt();
		int c = sc.nextInt();
		int d = sc.nextInt();
		int i = 0;
		// 文字列の入力
		while( b < a + 1){
			b = 2 * b;
            i++;
		}
		while( c < b + 1){
			c = 2 * c;
            i++;
		}
		if(i < d + 1){
			System.out.println("Yes");
		}
		else{
			System.out.println("No");
		}
		
		
	}
}
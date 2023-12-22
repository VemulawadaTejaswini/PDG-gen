import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int r = sc.nextInt();
		// スペース区切りの整数の入力
		int d = sc.nextInt();
		int x = sc.nextInt();
		// 出力
		
		int o = x;
		
		
		for(int i=1;i<=10;i++){		
			o = r * o - d;
				System.out.println(o);
				
		}
	}
}
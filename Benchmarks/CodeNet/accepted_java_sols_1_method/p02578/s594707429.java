import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int a = sc.nextInt();
		// スペース区切りの整数の入力
		// 文字列の入力
		int[] d = new int[a];
		for(int i = 0; i < a; i++){
			d[i] = sc.nextInt();
		}
		int b = d[0];
		long c = 0;
		 
		for(int i = 0; i < a; i++){
			if(d[i] > b){
				b = d[i];
			}
			c += b - d[i];
		}
		System.out.println(c);
		
		
	}
}
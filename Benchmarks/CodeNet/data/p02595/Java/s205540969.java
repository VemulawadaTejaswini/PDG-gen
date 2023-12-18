import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int a = sc.nextInt();
		// スペース区切りの整数の入力
		int b = sc.nextInt();
		// 文字列の入力
		int[] d = new int[a];
		int[] e = new int[a];
		for(int i = 0; i < a; i++){
			d[i] = sc.nextInt();
			e[i] = sc.nextInt();
		} 
		int f = 0;
		
		for(int i = 0; i < a; i++){
			if(d[i] * d[i] + e[i] * e[i] <= b * b){
				f++;
			}
		}
		System.out.println(f);
		
		
	}
}
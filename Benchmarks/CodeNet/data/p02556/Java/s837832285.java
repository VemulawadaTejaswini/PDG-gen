import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int a = sc.nextInt();
		// スペース区切りの整数の入力
		int[] b = new int[a];
		int[] c = new int[a];
		// 文字列の入力
		
		int[] d = new int[a];
		int[] e = new int[a];
		for(int i = 0; i < a; i++){
			d[i] = sc.nextInt();
			e[i] = sc.nextInt();
			b[i] = d[i] + e[i];
			c[i] = d[i] - e[i];
		}
		int intMax = b[0]; 
		for(int i = 1; i < a; i++) {// 要素0番目のは代入済みのため1番目から開始する
          
			if(intMax < b[i]) {
				intMax = b[i];
			}
		}
		int intMin = b[0]; 
		for(int i = 1; i < a; i++) {// 要素0番目のは代入済みのため1番目から開始する

			if(intMin > b[i]) {
				intMin = b[i];
			}
		}
		int f = intMax - intMin; 
		int intMaxc = c[0]; 
		for(int i = 1; i < a; i++) {// 要素0番目のは代入済みのため1番目から開始する

			if(intMaxc < c[i]) {
				intMaxc = c[i];
			}
		}
		int intMinc = c[0]; 
		for(int i = 1; i < a; i++) {// 要素0番目のは代入済みのため1番目から開始する

			if(intMinc > c[i]) {
				intMinc = c[i];
			}
		}
		int g = intMaxc - intMinc;
		System.out.println(Math.max(f, g));
		
		
	}
}
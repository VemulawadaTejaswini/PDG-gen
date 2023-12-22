import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int a = sc.nextInt();
		// スペース区切りの整数の入力
		int b = 1;
		boolean c = true;
		int e = 0;
		// 文字列の入力
		int[] d = new int[a];
		for(int i = 0; i < a; i++){
			d[i] = sc.nextInt();
		} 
		while(c){
			c = false;
			for(int i = e; i < a && !c; i++){
				if(d[i] == b){
					c = true;
					b++;
					e = i + 1;
				}
			}
			
		}
		if(b == 1){
			System.out.println(-1);
		}else{
			System.out.println(a - b + 1);
		}
		
		
		
	}
}
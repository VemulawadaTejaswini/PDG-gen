	import java.util.*;
public class Main {

		public static void main(String[] args){
			Scanner sc = new Scanner(System.in);
			// 整数の入力
			int r = sc.nextInt();
			// スペース区切りの整数の入力
			int D = sc.nextInt();
			int x0 = sc.nextInt();
			int x [] = new int [11];
			x[0]=x0;
			for (int i = 1; i<11 ; i++){
					x[i]=r*x[i-1]-D;
				System.out.println(x[i]);
			}
		}

	}
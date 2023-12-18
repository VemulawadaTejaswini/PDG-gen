	import java.util.*;
public class Main {

		public static void main(String[] args){
			Scanner sc = new Scanner(System.in);
			// 整数の入力
			int A = sc.nextInt();
			// スペース区切りの整数の入力
			int B = sc.nextInt();
			int ans = 0;
			if(A>=13){
				ans = B;
			}else if(6<=A && A<=12)
				ans = B/2;
			else if (5>=A){
				ans = 0;
			}
			System.out.println(ans);
		}

	}
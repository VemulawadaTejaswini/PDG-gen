import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		long a = sc.nextLong();
		// スペース区切りの整数の入力
		long b = sc.nextLong();
		long c = sc.nextLong();
		// 文字列の入力
		long d = a / c;
		if(d > b){
			System.out.println(a - b * c);
         // System.out.println(0);
		}else{
			if((b- d) % 2 == 0){
				System.out.println(a % c);
              // System.out.println(1);
			}
			else{
				System.out.println(- (a % c) + c);
              // System.out.println(2);
			}
		}
		
		
	}
}
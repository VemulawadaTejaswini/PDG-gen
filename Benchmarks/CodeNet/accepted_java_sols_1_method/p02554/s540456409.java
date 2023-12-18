import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		
		// スペース区切りの整数の入力
		long a = sc.nextLong();
		long b = 1;
		long c = 2;
		long d = 1;
		long e = 1000000007;
		
		
		for(int i = 0; i < a; i++){
			b = b * 10;
			b = b % e;
			c = c * 9;
			c = c % e;
			d = d * 8;
			d = d % e;
			
		}
		long f = b - c + d;
		if(f < 0){
			System.out.println(b - c + d + e);
          //System.out.println(b);
		}else{
			System.out.println(b - c + d);
           //System.out.println(b);
		} 
		
		
	}
}
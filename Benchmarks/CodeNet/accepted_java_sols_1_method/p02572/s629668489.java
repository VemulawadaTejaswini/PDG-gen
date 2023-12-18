import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int a = sc.nextInt();
		// スペース区切りの整数の入力
		long b = 0;
		long c = 0;
		// 文字列の入力
		long[] d = new long[a];
		for(int i = 0; i < a; i++){
			d[i] = sc.nextInt();
			b += d[i];
			b = b % 1000000007;
          //System.out.println(b);
			c += d[i] * d[i];
			c = c % 1000000007;
          //System.out.println(c);
		}
      long e = (b * b - c) % 1000000007;
      //System.out.println(e);
		if(e % 2 == 0){
			System.out.println(e / 2);
		}else{
			System.out.println(( e + 1000000007) / 2);
		}
		
		
	}
}
import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		long a = sc.nextLong();
		// スペース区切りの整数の入力
		long b = sc.nextLong();
		long c = sc.nextLong();
		long d = sc.nextLong();
		// 文字列の入力
		long e = a * c;
		long f = b * c;
		long g = b * d;
		long h = a * d;
		
		if( e >= f &&  e >= g &&  e >= h){
			System.out.println(e);
		}else if( f >= e &&  f >= g &&  f >= f){
			System.out.println(f);
		}else if( g >= e &&  g >= f &&  g >= h){
			System.out.println(g);
		}else if( h >= e &&  h >= f &&  h >= g){
			System.out.println(h);
		}
		
	}
}
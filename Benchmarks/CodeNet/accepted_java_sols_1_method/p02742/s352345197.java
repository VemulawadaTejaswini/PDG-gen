import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		long h = sc.nextLong();
		long w = sc.nextLong();

		if ( h==1 || w==1) {
			System.out.println(1);
			System.exit(0);
		}
		// 出力
		System.out.println(w*(h/2l)+(h%2l)*(w+1l)/2l);
	}
}
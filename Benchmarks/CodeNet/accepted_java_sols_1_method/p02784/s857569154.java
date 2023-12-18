import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int h = sc.nextInt();
		int n = sc.nextInt();

		int k = 0;
		for ( int i=0; i<n; i++ ) {
			int a = sc.nextInt();
			k = k+a;
		}

		// 出力
		if ( k >= h ) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}

	}
}
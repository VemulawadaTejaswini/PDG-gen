import java.util.*;
import java.math.*;
import java.lang.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int n = sc.nextInt();
		int h = sc.nextInt();
		int w = sc.nextInt();
		int result = 0;

		for(int i=0;i<n;i++){
			int a = sc.nextInt();
			int b = sc.nextInt();

			if(a <h || b < w){
				continue;
			}
			// System.out.println(a/h);
			// System.out.println(b/w);
			result += Math.min(a/h,b/w);
		}

		System.out.println(result);
	}


}
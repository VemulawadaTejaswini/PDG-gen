import java.util.*;
import java.math.*;
import java.lang.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int n = sc.nextInt();
		int curMaxH =0;
		int count = 0;
		for (int i = 0; i < n; i++) {
			int h = sc.nextInt();

			curMaxH = Math.max(curMaxH,h);
			if(curMaxH==h){
				count++;
			}
		}

		System.out.println(count);

	}
}

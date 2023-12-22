import java.util.*;
import static java.lang.Math.*;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		// 入力
		String s = sc.next();

		// 計算
		int n = 0;
		
		for(int i = 0; i < s.length(); i++){
			int m = Integer.parseInt(s.substring(i, i+1));
			n = n + m;
		}

		// 出力
		System.out.println(n);

	}

}



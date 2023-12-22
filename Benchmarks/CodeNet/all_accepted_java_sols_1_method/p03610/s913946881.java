import java.util.*;
import static java.lang.Math.*;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		
		// 入力
		String s = sc.next();
		
		// 計算
		int result = 0;
		for(int i = 0; i < s.length(); i++){
		    if(i%2 == 1) continue;
		    System.out.print(s.charAt(i));
		}
		
		// 出力
		//System.out.println(result);
	}
}


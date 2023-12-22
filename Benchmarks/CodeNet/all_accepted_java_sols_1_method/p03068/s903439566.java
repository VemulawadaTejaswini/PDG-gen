import java.util.*;
import java.math.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		List<Integer> list = new ArrayList<>();

		int n = sc.nextInt();
		String str = sc.next();
		int k = sc.nextInt();
		String sTarget = str.substring(k-1,k);

		for (int i = 0; i < n; i++) {
			String s = str.substring(i,i+1);
			if(sTarget.equals(s)){
				System.out.print(s);
			}else{
				System.out.print("*");
			}
		}
	}
}
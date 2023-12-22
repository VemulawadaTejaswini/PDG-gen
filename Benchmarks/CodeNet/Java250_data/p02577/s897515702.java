import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		String n = sc.next();
		int sum=0;
        for (int i=0;i<n.length();i++){
          sum += Character.getNumericValue(n.charAt(i));
        }
        String ans = (sum%9==0) ? "Yes" : "No";
        // 出力
		System.out.println(ans);
	}
}
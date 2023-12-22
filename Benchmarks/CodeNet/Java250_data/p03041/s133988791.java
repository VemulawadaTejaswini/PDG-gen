import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
    
		// 整数の入力
		int n = sc.nextInt();
		int k = sc.nextInt();
    
		// 文字列の入力
		String[] sList = sc.next().split("");
        sList[k - 1] = sList[k - 1].toLowerCase();
        String ans = "";
        for (String s : sList) {
          ans += s;
        }
    
		// 出力
		System.out.println(ans);
	}
}
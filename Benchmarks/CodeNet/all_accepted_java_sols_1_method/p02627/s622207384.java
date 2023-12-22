import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
    
    // 文字列の入力
    String s = sc.next();
		// 出力
    String ans = s.matches("[A-Z]") ? "A":"a";
    System.out.println(ans);
	}
}
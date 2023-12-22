import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
    
		// 文字列の入力
		String s = sc.next();
    
		// 出力
		System.out.println(s.length() >= 4 
                           && s.substring(0, 4).equals("YAKI") 
                           ? "Yes" : "No");
	}
}
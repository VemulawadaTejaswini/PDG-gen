import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
    
		// 文字列の入力
		String s1 = sc.next();
        String s2 = sc.next();
        String[] s2List = s2.split("");
        String ans = "A" + s2List[0] + "C";
    
		// 出力
		System.out.println(ans);
	}
}
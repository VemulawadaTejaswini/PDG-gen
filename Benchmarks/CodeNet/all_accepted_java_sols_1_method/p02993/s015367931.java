import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		// 文字列の入力
		String s = sc.next();
		String[] S = s.split("");

		String ans = "Good";

		if(S[0].equals(S[1])||S[1].equals(S[2])||S[2].equals(S[3]))ans="Bad";

		// 出力
		System.out.println(ans);
	}
}
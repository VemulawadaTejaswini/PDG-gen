import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		//文字列を宣言して読み込む
		String S = sc.next();
		String ans="Good";
		if(S.charAt(0)==S.charAt(1)){ans="Bad";}
		if(S.charAt(1)==S.charAt(2)){ans="Bad";}
		if(S.charAt(2)==S.charAt(3)){ans="Bad";}
		System.out.println(ans);
	}
}
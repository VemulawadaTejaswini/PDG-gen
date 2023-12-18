import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		// 整数の入力
		int n = sc.nextInt();
		int k = sc.nextInt();
		// 文字列の入力
		String s = sc.next();
		String[] S = s.split("");

		switch(S[k-1]){
			case "A":
				S[k-1]="a";
				break;
			case "B":
				S[k-1]="b";
				break;
			case "C":
				S[k-1]="c";
				break;
		}

		String ans = "";

		for(String str:S)ans+=str;

		// 出力
		System.out.println(ans);
	}
}
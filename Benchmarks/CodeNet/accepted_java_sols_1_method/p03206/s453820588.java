import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int a = sc.nextInt();
		String s = "";
		if (a == 25) s = "Christmas";
		if (a == 24) s = "Christmas Eve";
		if (a == 23) s = "Christmas Eve Eve";
		if (a == 22) s = "Christmas Eve Eve Eve";
		// 出力
		System.out.println(s);
	}
}

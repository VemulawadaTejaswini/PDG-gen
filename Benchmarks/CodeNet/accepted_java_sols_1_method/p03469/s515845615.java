import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 文字列の入力
        String s = sc.next();
        sc.close();
        String replaced = s.replace("2017", "2018");
		// 出力
		System.out.println(replaced);
	}
}

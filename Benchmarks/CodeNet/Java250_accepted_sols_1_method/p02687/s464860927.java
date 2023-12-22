import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 文字列の入力
		String lineString = sc.nextLine();

		// 出力
		System.out.println(lineString.equals("ARC") ? "ABC" : "ARC");
		sc.close();
	}
}

import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
// 標準入力からデータを読み込む準備
		try (Scanner sc = new Scanner(System.in)) { 
			String line = sc.nextLine();
			String answer = "";
			int length = line.length();
			for (int i = 0; i < length; i++) {
				char ch = line.charAt(i);  // 文字列(line)からi番目の文字を取り出す 
				if(Character.isLowerCase(ch) == true){// Character.isLowerCase で小文字かどうか判断可能
					answer += Character.toUpperCase(ch);// Character.toUpperCase, Character.toLowerCase で変換
				}else{
					answer += Character.toLowerCase(ch);
				}
			}
			System.out.println(answer); 
		}
	} 
}

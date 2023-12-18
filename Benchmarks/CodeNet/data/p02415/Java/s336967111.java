// 与えられた文字列の小文字と大文字を入れ替えた文字列を出力して下さい。アルファベット以外の文字はそのまま出力して下さい。
import java.util.Scanner;

class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);

		// 文字列読み込み, 文字列型→文字型変換
		char[] c = scan.nextLine().toCharArray();

		for(int i=0; i<c.length; i++){
			if('A'<= c[i] && c[i] <= 'Z'){
				// 小文字変換
				c[i] = Character.toLowerCase(c[i]);
			} else if('a'<= c[i] && c[i] <= 'z'){
				// 大文字変換
				c[i] = Character.toUpperCase(c[i]);
			} else{
				// そのまま
			}
			System.out.print(c[i]);
		}
		System.out.println();

	}
}

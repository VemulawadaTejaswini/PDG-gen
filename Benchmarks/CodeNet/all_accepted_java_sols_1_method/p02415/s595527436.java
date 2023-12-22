import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		int i;
		char cha = 0;
		String str;
		try (Scanner sc = new Scanner(System.in)) {
			str = sc.nextLine();
			for(i = 0; i < str.length(); i++) {
				cha = str.charAt(i); //strの文字列を一文字づつchaに入れる
				if(Character.isUpperCase(cha)){
					System.out.print(Character.toLowerCase(cha)); //chaが大文字の時小文字にする
				}else {
					System.out.print(Character.toUpperCase(cha)); //chaが小文字の時大文字にし、それ以外はそのまま出力
				}
			}
			System.out.println();
		}
	}
}


import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine();
		StringBuilder sb = new StringBuilder();
		
		for(int i = 0; i < str.length(); i++) {
			char check = str.charAt(i);
			// アルファベットかどうか
			if(!Character.isLetter(check)) {
				sb.append(check);
			}else if(Character.isUpperCase(check)) {
				check = Character.toLowerCase(check);
				sb.append(check);
			}else if(Character.isLowerCase(check)) {
				check = Character.toUpperCase(check);
				sb.append(check);
			}
		}
		
		System.out.println(sb);
	}

}


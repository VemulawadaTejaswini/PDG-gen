
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String s = sc.nextLine();
		String p = sc.nextLine();

		sc.close();

//		String s = "abcdefg";
//		String p = "gab";

		// 指定文字数だけ繰り返し表示する
		for(int offset=0; offset<s.length(); offset++) {
			String cmpStr = "";
			for(int i=0; i<p.length(); i++) {
				int count = i + offset;
				if(count >= s.length()) count = count - s.length();
//				System.out.println(count);
				cmpStr += s.charAt(count);
//				System.out.print(s.charAt(count));
			}
			if(cmpStr.equals(p)) {
				System.out.println("Yes");
				return;
			}
//			System.out.println("");
		}

		System.out.println("No");

	}

}

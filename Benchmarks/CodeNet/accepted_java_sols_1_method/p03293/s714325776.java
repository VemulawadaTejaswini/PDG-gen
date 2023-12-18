import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner sc1 = new Scanner(System.in);
		String s = sc1.next();
		String t = sc1.next();
		boolean flag = false;

		for (int i = 0 ; i < s.length() ; i++ ) {
			String str;
			str = s.substring(1,s.length()) + s.substring(0, 1);
			//System.out.println(str);
			//System.out.println(s);
			if ( str.equals(t)) {
				flag = true;
				break;
			}
			s = str;
		}

		if(flag) {
			System.out.println("Yes");
		}
		else {
			System.out.println("No");
		}

		sc1.close();
	}

}
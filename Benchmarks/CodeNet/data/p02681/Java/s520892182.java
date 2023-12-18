import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner in = new Scanner(System.in);
		String s = in.next();
		String t = in.next();
		boolean ok = true;

		char[] com_s = new char[s.length()];
		char[] com_t = new char[t.length()];

		for(int i=0; i<s.length(); i++) {
			if(!(com_s[i] == com_t[i])) {
				ok = false;
				break;
			}
		}
		if(ok && (t.length()-s.length()==1)){
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
	}

}

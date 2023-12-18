import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner in = new Scanner(System.in);

		String s = in.next();
		String t = in.next();

		char[] s1 = s.toCharArray();
		char[] t1 = t.toCharArray();

		int count = 0;

		for(int i=0;i<s.length();i++) {
			if(s1[i]!=t1[i]) {
				count++;
			}
		}

		System.out.println(count);

	}

}

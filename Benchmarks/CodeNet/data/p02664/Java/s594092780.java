import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		String t = sc.nextLine();
		StringBuilder t1 = new StringBuilder(t);
		
		for(int i=0; i<t1.length();i++) {
			if(t1.charAt(i)=='?') {
				t1.setCharAt(i,'D');
			}
		}
		System.out.println(t1.toString());
	}
}
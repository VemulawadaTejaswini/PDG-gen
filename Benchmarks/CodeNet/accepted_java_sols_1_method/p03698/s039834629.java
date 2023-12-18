import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		String S = sc.next();
		int index = S.length();
		String ans = "yes";
		char[] ary = new char[index];
		for(int i =  0 ; i < S.length(); i++) {
			ary[i] = S.charAt(i);
		}
		for(int i = 0 ; i < index ; i++) {
			for(int j = i + 1 ; j < index ; j++) {
				if(ary[i] == ary[j]) {
					ans = "no";
				}
			}
		}
		System.out.println(ans);
	}
}

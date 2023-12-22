import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();  //文字列S
		String newS = "";  //xに置き換えて新しく表示する文字列

		//newSにsの文字数分xを代入
		for(int i=0 ; i<s.length() ; i++) {
			newS += "x";
		}
		System.out.print(newS);
		sc.close();
	}
}
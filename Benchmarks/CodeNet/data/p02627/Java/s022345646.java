import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
//		入力表示
		String str =sc.next();

//		英大文字ならA、英小文字ならa
		if(str == str.toUpperCase()) {
			System.out.println("A");
		}else {
		System.out.println("a");
		}
		
	}
}
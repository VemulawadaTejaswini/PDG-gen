import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner stdin = new Scanner(System.in);	
		String a = stdin.next();
		String b = stdin.next();
		
		if(a.charAt(0)==b.charAt(2)&&a.charAt(1)==b.charAt(1)&&a.charAt(2)==b.charAt(0)) {
			System.out.println("YES");
		}else {
			System.out.println("NO");
		}

		
		// TODO 自動生成されたメソッド・スタブ

	}

}

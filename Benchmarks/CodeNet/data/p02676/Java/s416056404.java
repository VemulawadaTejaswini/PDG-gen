import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.next());
		String str = sc.next();

		if(n>=str.length()) {
			System.out.println(str);
		}else {
			System.out.println(str.substring(0,n)+"...");
		}

	}

}


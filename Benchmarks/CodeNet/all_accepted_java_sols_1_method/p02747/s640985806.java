
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		// 読み込み
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		
		String result = str.replace("hi", "");
		if(result.length() > 0)
			System.out.println("No");
		else
			System.out.println("Yes");
	}
}

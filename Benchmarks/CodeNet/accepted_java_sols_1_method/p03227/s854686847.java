
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		if(str.length() == 2) {
			System.out.println(str);
		}else {
			System.out.print(str.charAt(2));
			System.out.print(str.charAt(1));
			System.out.println(str.charAt(0));
			}
		
		sc.close();
	}

}

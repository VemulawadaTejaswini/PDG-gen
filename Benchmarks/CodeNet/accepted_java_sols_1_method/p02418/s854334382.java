import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scan = new Scanner(System.in);
		
		String s = scan.nextLine();
		String p = scan.nextLine();
		
		s = s + s;
		
		if(s.indexOf(p) != -1) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
		
	}

}


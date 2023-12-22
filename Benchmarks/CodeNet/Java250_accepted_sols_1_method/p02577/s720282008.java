import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scan = new Scanner(System.in);
		
		String n = scan.next();
		String[] s = n.split("");
		
		int total = 0;
		
		for(int i = 0; i < s.length; i++) {
			total += Integer.parseInt(s[i]);
		}
		
		if(total % 9 == 0) {
			System.out.print("Yes");
		}
		else {
			System.out.print("No");
		}
	}

}

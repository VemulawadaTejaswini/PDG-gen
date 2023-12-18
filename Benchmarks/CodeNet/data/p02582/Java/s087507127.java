import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scan = new Scanner(System.in);
		
		String s = scan.next();
		String[] s1 = s.split("");
		int ans = 0;
		

		if(s1[0].equals("R") && s1[1].equals("R") && s1[2].equals("R")) {
			ans = 3;
		}
		else if(s1[0].equals("R") && s1[1].equals("R")) {
			ans = 2;
		}
		else if(s1[1].equals("R") && s1[2].equals("R")) {
			ans = 2;
		}
		else if(s1[0].equals("R") || s1[1].equals("R") || s1[2].equals("R")) {
			ans = 1;
		}
		else {
			ans = 0;
		}
		
		System.out.print(ans);
	}

}

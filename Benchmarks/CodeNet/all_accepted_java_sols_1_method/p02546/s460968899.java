import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner scan = new Scanner(System.in);
				
		String s = scan.next();
		
		String[] s1 = s.split("");
		
		if(s1[s1.length-1].equals("s")) {
			System.out.print(s+"es");
		}else {
			System.out.print(s+"s");
		}
	}

}

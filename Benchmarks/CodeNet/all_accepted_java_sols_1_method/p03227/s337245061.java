import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine();
		scan.close();
		
		String out = null;
		if (str.length() == 2) {
			out = str;
		} else if(str.length() == 3) {
			out = String.valueOf(str.charAt(2))
					+ String.valueOf(str.charAt(1))
					+ String.valueOf(str.charAt(0));
		} else {
			out = "文字列は2文字または3文字で入力してください";
		}
		
		System.out.println(out);
	}

}

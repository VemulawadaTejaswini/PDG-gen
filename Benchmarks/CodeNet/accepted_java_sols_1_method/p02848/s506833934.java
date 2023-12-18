import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int x = scan.nextInt();
		String q = scan.nextLine();
		String s = scan.nextLine();
		String ans = "";
		String data = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		for (int i = 0; i < s.length(); i++ ) {
			int index = data.indexOf(String.valueOf(s.charAt(i)));
			index += x;
			if(index > 25) {
				index -= 26;
			}
			ans += String.valueOf(data.charAt(index));
		}
		System.out.println(ans);
	}
}

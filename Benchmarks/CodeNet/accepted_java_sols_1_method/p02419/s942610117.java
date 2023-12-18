import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String W = scan.next().toLowerCase();
		int cnt = 0;
		while(true) {
			String s = scan.next();
			if(s.equals("END_OF_TEXT")) {
				break;
			}
			if(s.toLowerCase().equals(W)) {
				cnt++;
			}
		}
		scan.close();
		System.out.println(cnt);
	}
}

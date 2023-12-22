
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		String str = scan.next();
		
		char[] list = str.toCharArray();
		int count = 0;
		int ans = 0;
		for (char c : list) {
			if (c == 'A' || c == 'C' || c == 'G' || c == 'T') {
				count++;
				if (ans < count) {
					
					ans = count;
				}
			} else {
				count = 0;
			}
		}
		
		System.out.println(ans);
		
		scan.close();
	}
}

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		long n = sc.nextLong();
		long count1 = 0;
		
		
		if(str.matches("1*")) {
			System.out.println("1");
			return;
		}
		
		for(int i = 0; i<str.length();i++) {
			if(str.charAt(i) == '1') {
				count1 ++;
			}else {
				break;
			}
		}
		if(count1 >= n) {
			System.out.println("1");
			return;
		}
		
		for (int t = 0; t < n; t++) {

			if (str.charAt(t) != '1') {
				System.out.println(str.charAt(t));
				return;
			}
		}
	}

}

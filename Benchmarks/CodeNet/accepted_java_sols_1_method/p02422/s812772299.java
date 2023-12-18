import java.util.*;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
	    Scanner scanner = new Scanner(System.in);
		String str = scanner.next();
		int q = scanner.nextInt();
		for (int i = 0; i < q; i++) {
			String order = scanner.next();
			int a = scanner.nextInt();
			int b = scanner.nextInt();
			if (order.equals("print")) {
				System.out.println(str.substring(a,b+1));
			}else if (order.equals("reverse")) {
				str = str.substring(0,a) + (new StringBuffer(str.substring(a,b+1)).reverse().toString()) + (str.substring(b+1,str.length()));
			}
			else if (order.equals("replace")) {
				String p = scanner.next();
				str = str.substring(0,a) + p + str.substring(b+1,str.length());
			}
		}
		
	}
}

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String o = scan.next();
		String e = scan.next();
		List<String> list = new ArrayList<String>();
		for(int i = 0; i < o.length(); i++) {
			list.add(o.charAt(i) + "");
			if(i < e.length()) {
				list.add(e.charAt(i) + "");
			}
		}
		for(String a:list) {
			System.out.print(a);
		}
		System.out.println();
	}
}
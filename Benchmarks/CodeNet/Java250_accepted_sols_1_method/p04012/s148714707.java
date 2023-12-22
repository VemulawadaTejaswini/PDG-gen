import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String w = scan.next();
		int l = w.length();
		String message = "No";
		if(l % 2 == 0) {
			List<String> list = new ArrayList<String>();
			for(int i = 0; i < l; i++) {
				list.add(w.charAt(i) + "");
			}
			for(;(l - list.size()) % 2 == 0 && list.size() != 0;) {
				List<String> set = new ArrayList<>();
				Collections.addAll(set, list.get(0));
				list.removeAll(set);
			}
			if(list.size() == 0) {
				message = "Yes";
			}
		}
		System.out.println(message);
	}
}
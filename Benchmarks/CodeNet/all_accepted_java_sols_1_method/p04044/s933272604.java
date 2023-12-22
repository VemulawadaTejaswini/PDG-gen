import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;



public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int L = sc.nextInt();

		List<String> strlist = new ArrayList<String>();

 		for (int i = 0; i < N; i++) {
			strlist.add(sc.next());
		}
 		Collections.sort(strlist);
 		StringBuilder sb = new StringBuilder();
 		for (String string : strlist) {
 			sb.append(string);
		}

 		System.out.println(sb.toString());

	}

}
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Integer a = Integer.parseInt(sc.next());
		Integer b = Integer.parseInt(sc.next());

		List<String> list = new ArrayList<>();
		StringBuilder sb =  new StringBuilder();
		for(int i=0;i<b; i++) {
			sb.append(a.toString());
		}
		list.add(sb.toString());
		StringBuilder sb2 =  new StringBuilder();
		for(int i=0;i<a; i++) {
			sb2.append(b.toString());
		}
		list.add(sb2.toString());
		Collections.sort(list);
		System.out.println(list.get(0));

	}
}

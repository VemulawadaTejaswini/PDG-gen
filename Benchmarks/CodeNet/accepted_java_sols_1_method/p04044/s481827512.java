import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		final Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int l = sc.nextInt();
		ArrayList<String> list = new ArrayList<>();
		for(int i = 0; i < n; i++) {
			list.add(sc.next());
		}
		Collections.sort(list);
		StringBuilder sb = new StringBuilder();
		for(String s : list) {
			sb.append(s);
		}
		System.out.println(sb);
	}
}
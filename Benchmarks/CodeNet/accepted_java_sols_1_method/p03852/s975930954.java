import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<String> list = new ArrayList<String>();
		list.add("a");
		list.add("i");
		list.add("u");
		list.add("e");
		list.add("o");
		String s = sc.next();
		if (list.contains(s)) {
			System.out.println("vowel");
		} else {
			System.out.println("consonant");
		}
	}
}
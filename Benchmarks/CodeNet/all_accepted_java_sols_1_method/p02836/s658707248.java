import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	static List<List<Integer>> ptnList = new ArrayList<>();

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		sc.close();

		int count = 0;

		int l = s.length();
		int h = l / 2;

		for(int i = 0; i < h; i++) {
			String s1 = s.substring(i, i + 1);
			String s2 = s.substring(l - i - 1, l - i);
			if(s1.equals(s2) == false) {
				count++;
			}
		}

		System.out.println(count);

	}

}

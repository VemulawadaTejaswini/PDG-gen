import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		List<Integer> arr = new ArrayList<>();
		String s = in.nextLine();
		in.close();
		for (int i = 1; i < s.length() + 1; i++) {
			if (s.charAt(i - 1) == '0') {
				arr.add(0);
			} else if (s.charAt(i - 1) == '1') {
				arr.add(1);
			} else {
				if (arr.size() == 0) {
				} else {
					arr.remove(arr.size()-1);
				}
			}
		}
		for (int e : arr) {
			System.out.print(e);
		}
	}
}

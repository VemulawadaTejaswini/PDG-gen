import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		HashSet<Integer> set = new HashSet<>();
		String result = "YES";
		for (int i = 0; i < n; i++) {
			int num = sc.nextInt();
			if (set.contains(num)) {
				result = "NO";
				break;
			}
			set.add(num);
		}
		sc.close();
		System.out.println(result);
	}
}
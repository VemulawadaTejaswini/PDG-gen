import java.util.HashSet;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int N = scn.nextInt();
		HashSet<Integer> arr = new HashSet<Integer>();
		boolean yes = true;
		for (int i = 0; i < N; i++) {
			int a = scn.nextInt();
			if (arr.contains(a)) {
				yes = false;
				break;
			} else {
				arr.add(a);
			}
		}
		System.out.println(yes ? "YES" : "NO");
	}

}

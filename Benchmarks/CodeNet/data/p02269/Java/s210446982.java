import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {

	static int N;

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		N = sc.nextInt();
		sc.nextLine();

		Set<Integer> dict = new HashSet<>(N);

		for (int i = 0; i < N; i++) {
			String[] in = sc.nextLine().split(" ");
			Integer val = replaceACGT(in[1]);
			doMethod(in[0], val, dict);
		}
	}

	private static Integer replaceACGT(String in) {
		int result = 0;
		for (char c : in.toCharArray()) {
			int now;
			
			switch (c) {
			case 'A':
				now = 1;
				break;
			case 'C':
				now = 2;
				break;
			case 'G':
				now = 3;
				break;
			case 'T':
				now = 4;
				break;
			default:
				now = 1;
				break;
			}
			
			result += now;
			result *= 5;
		}
		return result;
	}

	private static void doMethod(String method, Integer val, Set<Integer> dict) {

		if(method.charAt(0) == 'i') {
			dict.add(val);

		} else {
			if(dict.contains(val)) {
				System.out.println("yes");
			} else {
				System.out.println("no");
			}
		}
	}
}
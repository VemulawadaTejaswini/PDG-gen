import java.util.LinkedList;
import java.util.Scanner;

class Main {

	public static void main(String[] args) {
		Scanner sc = null;
		try {
			sc = new Scanner(System.in);
			while (sc.hasNextInt()) {
				int thing = sc.nextInt();
				int weight = 512;

				LinkedList<Integer> result = new LinkedList<Integer>();

				while (thing != 0) {
					if (thing < weight) {
						weight /= 2;
					} else {
						thing -= weight;
						result.push(weight);
					}
				}
				print(result);
			}
		} finally {
			sc.close();
		}
	}

	public static void print(LinkedList<Integer> list) {
		StringBuilder sb = new StringBuilder();
		for (int num : list) {
			sb.append(num).append(" ");
		}
		sb.deleteCharAt(sb.length() - 1);

		System.out.println(sb);
	}
}
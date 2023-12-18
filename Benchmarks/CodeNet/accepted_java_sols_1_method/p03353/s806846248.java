import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			String s = sc.next();
			int k = sc.nextInt();
			String[] arr = new String[k];
			int len = s.length();
			for (int i = 0; i < len; i++) {
				for (int j = i + 1; j <= len && j <= i + k; j++) {
					String next = s.substring(i, j);
					for (int at = 0; at < k; at++) {
						if (arr[at] == null) {
							arr[at] = next;
							break;
						}
						if (next.compareTo(arr[at]) > 0) {
							continue;
						} else if (next.compareTo(arr[at]) == 0) {
							break;
						} else {
							for (int mv = k - 1; mv > at; mv--) {
								arr[mv] = arr[mv - 1];
							}
							arr[at] = next;
							break;
						}
					}
				}
			}
			System.out.println(arr[k - 1]);
		}
	}
}
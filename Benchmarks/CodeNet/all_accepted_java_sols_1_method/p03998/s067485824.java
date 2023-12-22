import java.util.*;

public class Main {
	
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] arr = new String[3];
		int[] idxes = new int[3];
		for (int i = 0; i < 3; i++) {
			arr[i] = sc.next();
		}
		int idx = 0;
		while (true) {
			if (idxes[idx] >= arr[idx].length()) {
				System.out.println((char)('A' + idx));
				break;
			}
			int i = idxes[idx];
			idxes[idx]++;
			idx = arr[idx].charAt(i) - 'a';
		}
	}
}

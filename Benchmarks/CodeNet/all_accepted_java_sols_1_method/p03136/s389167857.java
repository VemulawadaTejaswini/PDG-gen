import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		final int N = sc.nextInt();
		sc.nextLine();
		
		final List<Integer> ls = new ArrayList<>();
		int max = -1;
		int maxId = -1;
		for (int i = 0; i < N; i++) {
			final int l = sc.nextInt();
			ls.add(l);
			
			if (l > max) {
				max = l;
				maxId = i;
			}
		}
		
		int sum = 0;
		for (int i = 0; i < N; i++) {
			if (i == maxId) {
				continue;
			}
			
			sum += ls.get(i);
		}
		
		if (max < sum) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}

}
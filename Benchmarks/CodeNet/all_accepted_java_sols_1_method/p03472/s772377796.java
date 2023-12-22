import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main{
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		int H = scanner.nextInt();
		int a[] = new int[N + 1];
		int b[] = new int[N + 1];
		for (int i = 0; i < N; i++) {
			a[i] = scanner.nextInt();
			b[i] = scanner.nextInt();
		}
		scanner.close();
		
		int aMax = 0;
		List<Integer> bOver = new ArrayList<>();
		int turn = 0;
		
		for (int i = 0; i < N; i++) {
			aMax = Math.max(aMax, a[i]);
		}
		
		for (int i = 0; i < N; i++) {
			if (aMax < b[i]) {
				bOver.add(b[i]);
			}
		}
		
		Collections.sort(bOver, Collections.reverseOrder());
		
		for (int i = 0; i < bOver.size(); i++) {
			if (H <= 0) {
				System.out.println(turn);
				return;
			}
			turn++;
			H = H - bOver.get(i).intValue();
		}
		
		while (H > 0) {
			turn++;
			H = H - aMax;
		}
		System.out.println(turn);
		
	}
	
}
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
 
public class Main {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		final int N = scan.nextInt();
		int allSum = 0;
		List<Integer> list = new ArrayList<>();
		for (int i = 0; i < N; i++) {
			int n = scan.nextInt();
			list.add(n);
			allSum += n;
		}
		
		int nowSum = 0;
		int minSum = Integer.MAX_VALUE;
		for (int i = 0; i < N; i++) {
			nowSum += list.get(i);
			minSum = (int) Math.min(minSum, Math.abs(nowSum - (allSum - nowSum)));
		}
		System.out.println(minSum);
	}
}
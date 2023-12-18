import java.util.*;
public class Main {
	
	public static void main(String... args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		int min = Integer.MAX_VALUE;
		int sum = 0;
		int[] map = new int[N];
		for (int i = 0; i < N; i++) {
			int s = sc.nextInt();
			map[i] = s;
			
			sum += s;
			
			min = Math.min(min, s % 10 == 0 ? Integer.MAX_VALUE: s);
		}
		
		if (sum % 10 == 0 && Integer.MAX_VALUE == min) {
			System.out.println(0);
		} else if (sum % 10 == 0) {
			System.out.println(sum - min);
		} else {
			System.out.println(sum);
		}
	}
	
}
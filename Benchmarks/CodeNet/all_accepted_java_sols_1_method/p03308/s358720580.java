import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n, a, max = 0, min = 1000000000;
		
		n = Integer.parseInt(sc.next());
		
		for (int i = 0; i < n; i++) {
			a = Integer.parseInt(sc.next());
			max = max < a ? a : max;
			min = min > a ? a : min;
		}
		
		System.out.println(max - min);
	}
}
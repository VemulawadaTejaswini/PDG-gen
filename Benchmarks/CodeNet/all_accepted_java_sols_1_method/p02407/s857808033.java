import java.util.*;

public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer>plane = new ArrayList<>();
		ArrayList<Integer> reverse = new ArrayList<>();
		
		int n = sc.nextInt();
		int i = 0;
		int input;
		
		while(i < n) {
			input = sc.nextInt();
			plane.add(input);
			i++;
		}
		
		i = 0;
		while(i < n) {
			reverse.add(plane.get(n-1-i));
			i++;
		}
		
		for(i = 0; i < n; i++) {
			if(i == n - 1) {
				System.out.printf("%d", reverse.get(i));
			} else {
				System.out.printf("%d ", reverse.get(i));
			}
		}
		System.out.println();
	}
}
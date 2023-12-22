
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int max = 0, min = (int) 2e9;
		
		for (int i = 0; i < n; i++) {
			int a = sc.nextInt();
			max = Math.max(max, a);
			min = Math.min(min, a);
		}
		
		System.out.println(max - min);
		
	}

}

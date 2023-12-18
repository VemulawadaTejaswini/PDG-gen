import java.util.*;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		
		int result = 100000;
		
		for(int i = 0; i < n; i++) {
			result+=result * 0.05;
			result = (int)Math.ceil((double)result / 1000) * 1000;
		}
		
		System.out.println(result);
	}
}
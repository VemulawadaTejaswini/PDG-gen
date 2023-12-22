import java.util.*;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		double a = 0;
		
		for(int i = 0; i < n; i++) a += 1.0 / sc.nextInt();

		System.out.println(1 / a);
	}
}
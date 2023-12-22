import java.util.*;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt(), b = sc.nextInt();
		
		for (int i = 1; i <= 2000; i++) {
			if ((int)(i * 0.08) == a && (int)(i * 0.1) == b) {
				System.out.println(i);
				return;
			}
		}
		
		System.out.println(-1);
		
	}

}
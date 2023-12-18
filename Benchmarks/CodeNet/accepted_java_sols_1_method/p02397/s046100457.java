import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			
			if (a + b == 0) {
				break;
			}
			
			System.out.println(String.format("%d %d", Math.min(a,  b), Math.max(a, b)));
		}
	}
}


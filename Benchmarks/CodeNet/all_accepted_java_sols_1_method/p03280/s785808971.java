import java.util.*;

class Main {
	public static void main (String[] args) {
		Scanner scanner = new Scanner(System.in);
		int A = scanner.nextInt();
		int B = scanner.nextInt();
		
		int area = (A-1) * (B-1);
		System.out.println(area);
	}
}
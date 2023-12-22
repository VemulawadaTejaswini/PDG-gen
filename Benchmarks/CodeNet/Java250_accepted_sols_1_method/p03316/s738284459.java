import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.next());
		int s = 0;
		int temp = n;
		
		for (int i = 9; i >= 0; i--) {
			s += temp / (int)Math.pow(10, i);
			temp = temp % (int)Math.pow(10, i);
		}
		
		System.out.println(n % s == 0 ? "Yes" : "No");
	}
}
import java.util.*;

public class Main{
	public static void main(String[] args) throws Exception {
		Scanner s = new Scanner(System.in);
		int A = s.nextInt(), B = s.nextInt(), C = s.nextInt();
		System.out.println(Math.min(B / A, C));
	}
}

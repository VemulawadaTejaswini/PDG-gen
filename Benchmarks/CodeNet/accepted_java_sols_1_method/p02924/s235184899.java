import java.util.*;

public class Main{
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		long N = sc.nextLong() - 1;
		long result = N * (N + 1) / 2;
		System.out.println(result);
	}
}
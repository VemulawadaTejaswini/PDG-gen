import java.util.*;

public class Main{
	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int L = sc.nextInt();
		sc.close();
		
		int result = (N *(2 * L + N - 1))/2;
		result -= ((L >= 0)?L:Math.min(0, L + N - 1));
		
		System.out.println(result);
	}
}
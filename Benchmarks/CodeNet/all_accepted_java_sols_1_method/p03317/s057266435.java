import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();		
		int k = scan.nextInt();
		int ans = (int)Math.ceil((double)(n - 1)/ (k - 1));
		System.out.println(ans);
	}
}
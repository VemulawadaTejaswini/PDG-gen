import java.util.*;

public class Main {

	public static void main(String[] args) throws Exception{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();
		long ans = (long)Math.pow(n, 3);
		System.out.println(ans);
	}
}

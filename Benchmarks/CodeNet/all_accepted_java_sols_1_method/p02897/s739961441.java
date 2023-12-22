import java.util.*;

public class Main{
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args){
		int n = sc.nextInt();
		int nOdd = (n % 2 == 0) ? n / 2 : (n + 1) / 2;
		double ans = 1.0 * nOdd / n;
		System.out.println(ans);
	}
}
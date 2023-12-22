import java.util.*;

public class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();

		int ans = N / 2;
		if (N % 2 != 0) ans ++ ;

		System.out.println(ans);
	}
}
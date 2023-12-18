import java.util.Scanner;


public class Main {

	public static void main(String[] args)  {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.next());
		int ans = n;
		ans += n*n;
		ans += n*n*n;
		System.out.println(ans);
		}
}



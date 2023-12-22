import java.util.Scanner;


public class Main {


//	final int MOD = 1000000007;

//	public static long min = 2000000000;
	public static long ans = 0;

	public static void main(String[] args) {

//		int ans = 0;
		Scanner sc = new Scanner(System.in);
		boolean f = false;

//		long k = sc.nextLong();

//		int n = sc.nextInt();
		String string = sc.next();
		String[] s = string.split("");

		//-------------------------------------------------------------------------------------

		if(string.contains("A") && string.contains("B")) {
			f = true;
		}

		//-------------------------------------------------------------------------------------

		if(f) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}

//		System.out.println(ans);

		sc.close();
	}
}
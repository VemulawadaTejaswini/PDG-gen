import java.util.Scanner;


public class Main {


//	final int MOD = 1000000007;

//	public static int min = 3000000;

	public static void main(String[] args) {

		int ans = 0;
		Scanner sc = new Scanner(System.in);
		boolean f = false;

//		long k = sc.nextLong();

//		int n = sc.nextInt();


		String string = sc.next();
		String[] s = string.split("");
		String string2 = sc.next();
		String[] t = string2.split("");

		//-------------------------------------------------------------------------------------

		for(int i = 0; i < s.length; i++) {
			if(!s[i].equals(t[i])) {
				ans++;
			}
		}

		//-------------------------------------------------------------------------------------

//		if(f) {
//			System.out.println("Yes");
//		} else {
//			System.out.println("No");
//		}

		System.out.println(ans);

		sc.close();
	}



}
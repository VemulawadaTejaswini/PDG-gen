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

//		int[] ans = new int[n];

		//-------------------------------------------------------------------------------------

		for(int i = 0; i < s.length; i++) {
			if(s[i].equals("?")) {
				if(i >= 1) {
					if(s[i-1].equals("P")) {
						s[i] = "D";
					}
				}
				if(!f) {
					s[i] = "D";
				}
			}
		}

		for(int i = 0; i < s.length; i++) {
			System.out.print(s[i]);
		}
		System.out.println();
		//-------------------------------------------------------------------------------------

//		if(f) {
//			System.out.println("Yes");
//		} else {
//			System.out.println("No");
//		}

//		System.out.println(ans);

		sc.close();
	}



}
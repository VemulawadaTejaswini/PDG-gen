import java.util.Scanner;


public class Main {


//	final int MOD = 1000000007;

//	public static int min = 3000000;

	public static void main(String[] args) {

		int ans = 0;
		Scanner sc = new Scanner(System.in);
		boolean f = false;

//		long k = sc.nextLong();
		int x = sc.nextInt();
		int y = sc.nextInt();


		//-------------------------------------------------------------------------------------

		for(int i = 0; i <= 100; i++) {
			for(int j = 0; j <= 100; j++) {
				if((i * 2) + (j * 4) == y) {
					if(i+j == x)
						f = true;
				}
			}
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
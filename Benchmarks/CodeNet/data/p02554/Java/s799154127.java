import java.util.Scanner;

public class Main {
	public static void main(String[]args) {
		try(Scanner scan = new Scanner(System.in)){

			int N = scan.nextInt();

			long mod = (long)1e9+7;

			long g = 1;
			long g2 = 1;
			long g3 = 1;
			long g4 = 1;

			for(int i = 0;i<N;i++) {
				g = (g*10)%mod;
				g2 = (g2*8)%mod;
				g3 = (g3*9)%mod;
				g4 = (g4*9)%mod;

			}

			g3 =  (g3+g4)%mod;

			g3 = (g3-g2+mod)%mod;

			g = (g-g3+mod)%mod;

			System.out.println(g);


		}


	}


}

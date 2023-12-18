import java.util.Scanner;

public class Main {
	public static void main (String[] args) {
//------------------------------------------------------------

		Scanner sc =new Scanner(System.in);
		int N = sc.nextInt();
		int X = sc.nextInt();
		int min =1000;
		for(int i = 0 ; i < N; i++) {
			int m = sc.nextInt();
			X -= m;
			min = Math.min(m, min);
		}
		int smallDonuts =X/min ;
		int ans = N+smallDonuts;
		System.out.println(ans);
		sc.close();

//------------------------------------------------------------
	}
}
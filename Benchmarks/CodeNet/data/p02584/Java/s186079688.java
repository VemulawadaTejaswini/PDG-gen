import java.util.Scanner;

public class Main {
	public static void main(String[]args) {
		try(Scanner scan = new Scanner(System.in)){
			long X = scan.nextLong();
			long K = scan.nextLong();
			long D = scan.nextLong();



		long absX = Math.abs(X);
		long ans;
		if(absX/D<K) {//あまりにたどり着くまでの回数よりKが大きいなら
			long k = K-absX/D;
			ans = k%2==0?absX%D:D-absX%D;
			System.out.println(ans);
		}else {
			 ans = absX-D*K;
			System.out.println(ans);
		}


		}
	}


}

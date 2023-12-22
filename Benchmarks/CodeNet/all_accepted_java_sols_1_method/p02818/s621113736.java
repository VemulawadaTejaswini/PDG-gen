import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long A = sc.nextLong();
		long B = sc.nextLong();
		long K = sc.nextLong();
		sc.close();
		if(A > K){
			A -= K;
		}else{
			K -= A;
			A = 0;
			B = B - K > 0 ? B - K : 0;
		}
		System.out.println(A + " " + B);
	}
}
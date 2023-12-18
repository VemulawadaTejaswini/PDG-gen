import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		long X = sc.nextLong();
		long K = sc.nextLong();
		long D = sc.nextLong();

		if(D * K <= Math.abs(X)) {
			System.out.println(Math.abs(X)- (D * K));
			return;
		}else {
			long tmp = Math.abs(X) / D;
			if(X > 0) {
				X = X - (D * tmp);
			}else {
				X = X + (D * tmp);
			}
			K = K -tmp;
		}


		if(K%2 == 0) {
			System.out.println(Math.abs(X));
		}else {
			if(X > 0) {
				X = X - D;
			}else {
				X = X + D;
			}
			System.out.println(Math.abs(X));
		}
	}

}
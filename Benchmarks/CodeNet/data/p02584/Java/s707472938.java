import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		long X = Math.abs(sc.nextLong());
		long K = sc.nextLong();
		long D = sc.nextLong();

		if(D * K <= X) {
			System.out.println(X- (D * K));
			return;
		}

		for(int i=0;i<K;i++) {
			if(Math.abs(X-D) < Math.abs(X+D)) {
				X = X-D;
			}else {
				X = X+D;
			}
		}

	}

}
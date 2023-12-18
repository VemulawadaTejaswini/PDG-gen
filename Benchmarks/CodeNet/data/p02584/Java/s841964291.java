import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		long X = scan.nextLong();
		long K = scan.nextLong();
		long D = scan.nextLong();

		long p = X/D;
		long q = X%D;
		if(D/2<q){
			p++;
			q=D-q;
		}
		if(K<p){
			System.out.println(Math.abs(X-K*D));
		}else if((K-p)%2==0){
			System.out.println(q);
		}else{
			System.out.println(D-q);
		}
	}
}
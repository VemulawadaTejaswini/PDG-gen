import java.util.*;

public class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		long N = scan.nextLong();
		long b = scan.nextLong();
		long r = scan.nextLong();
		long res = N / (b+ r);
		long mod = N % (b+ r);

		if(mod > b){
			mod = b;
		}
		System.out.println(res*b + mod);

	}
}
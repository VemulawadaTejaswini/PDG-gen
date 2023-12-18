
import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		long m = stdIn.nextInt();
		long n = stdIn.nextInt();
		long k = m;
		for(int i=2;i<=n;i++){
			k = (k * m)%1000000007;
		}
		System.out.println(k);
	}

}
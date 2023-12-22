import java.util.*; 
import java.lang.*; 

public class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		
		long N = scan.nextLong();
		long K = scan.nextLong();
		
		long r = N%K;
		System.out.println(Math.min(r,K-r));
	}
}
import java.util.*;

public class Main{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		long A = sc.nextLong();
		long B = sc.nextLong();
		long K = sc.nextLong();
		
		System.out.println(Math.max(0, A - K) + " " + Math.max(0, Math.min(B, B - (K - A))));
	}
}

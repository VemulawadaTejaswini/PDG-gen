import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long A =sc.nextLong();
		long B =sc.nextLong();
		long K =sc.nextLong();
		
		long result1=Math.max(0,A-K);
		long result2=Math.max(0,Math.min(A+B-K,B));
		System.out.println(result1+" "+result2);
		
		
	}
}

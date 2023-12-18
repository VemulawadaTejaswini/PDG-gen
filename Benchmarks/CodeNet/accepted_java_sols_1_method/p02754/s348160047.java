import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long N = sc.nextLong();
		long A =sc.nextLong();
		long B =sc.nextLong();
		long ans = N%(A+B);
		long ans1 = N/(A+B);
	    if(ans>A) {
	    	ans = ans-(ans-A);
	    }
		System.out.println(A*ans1+ans);
	}
}


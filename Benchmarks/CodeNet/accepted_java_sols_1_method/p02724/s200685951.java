import java.util.*;
import java.lang.*;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		long X = sc.nextLong();
		long A = X/500*1000;
		long B = X%500/5*5;
		System.out.println(A+B);
	}
}
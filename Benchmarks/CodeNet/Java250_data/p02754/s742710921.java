import java.util.*;
public class Main {
	
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		
		String StrN = sc.next();
		String StrA = sc.next();
		String StrB = sc.next();
		long n = Long.parseLong(StrN);
		long a = Long.parseLong(StrA);
		long b = Long.parseLong(StrB);

		long block = n / (a+b);
		long surplus = n%(a+b);
		
		long result = (block * a) + (surplus<a?surplus:a);
		System.out.println(result);
	}
}
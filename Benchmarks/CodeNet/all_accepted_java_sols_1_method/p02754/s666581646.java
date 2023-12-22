import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();
		long a = sc.nextLong();
		long b = sc.nextLong();
		long ret = 0;
		if(a != 0) {
			long keisu = n/(a+b);
			long mod = n % (a+b);
			ret = a*keisu + (mod>a ? a : mod);
		}
		
		System.out.println(ret);
	}
}

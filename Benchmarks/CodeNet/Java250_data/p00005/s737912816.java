import java.util.Scanner;


public class Main{
	
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		long a, b;
		while(sc.hasNext()) {
			a = sc.nextLong();
			b = sc.nextLong();
			System.out.println(LCM(a, b) + " " + GCD(a, b));
		}
		sc.close();
	}
	
	static long GCD(long a, long b) {
		return a * b / LCM(a, b);
	}
	
	static long LCM(long a, long b) {
		long n0 = (a >= b) ? a: b;
		long n1 = (a >= b) ? b: a;
		
		if(n1 == 0) return n0;
		else return LCM(n1, n0 % n1);
	}
}
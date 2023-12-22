import java.util.Scanner;

public class Main {

	public static long gcd(long m, long n) {
		if(m < n) return gcd(n, m);
	    if(n == 0) return m;
	    return gcd(n, m % n);
	}

	public static long lcm(long m,long n) {
		return m * n / gcd(m ,n);
	}


	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Long A = Long.parseLong(sc.next());
		Long B = Long.parseLong(sc.next());
		Long C = Long.parseLong(sc.next());
		Long D = Long.parseLong(sc.next());
		sc.close();

		long x = A / C;
		long y = B / C;
		long numberC = 0;
		if((A % C == 0) && (B % C == 0)) {
			numberC = y - x + 1;
		}else if(A % C == 0){
			numberC = y - x + 1;
		}else if(B % C == 0) {
			numberC = y - x;
		}else {
			numberC = y - x;
		}

		long p = A / D;
		long q = B / D;
		long numberD = 0;
		if((A % D == 0) & (B % D == 0)) {
			numberD = q - p + 1;
		}else if(A % D == 0){
			numberD = q - p + 1;
		}else if(B % D == 0) {
			numberD = q - p;
		}else {
			numberD = q - p;
		}

		long E = lcm(C ,D);
		long s = B / E;
		long t = A / E;
		long numberE = 0;
		if((A % E == 0)&& (B % E == 0)) {
			numberE = s - t + 1;
		}else if(A % E == 0){
			numberE = s - t + 1;
		}else if(B % E == 0) {
			numberE = s - t;
		}else {
			numberE = s - t;
		}

		long result = numberC + numberD - numberE;
		long answer = B - A + 1 -result;
		System.out.println(answer);
	}
}

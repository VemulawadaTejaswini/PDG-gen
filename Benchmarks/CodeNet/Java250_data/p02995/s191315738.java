import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		long A = sc.nextLong();
		long B = sc.nextLong();
		long C = sc.nextLong();
		long D = sc.nextLong();
		long koumoku = B - A + 1;

//		long kosu = koumoku - (koumoku / C) - (koumoku / D) + (koumoku / (C * D));
		long kosu = koumoku - kosu(A, B, C) - kosu(A, B, D) + kosu(A, B, lcm(C,D));
		System.out.println(kosu);
	}

	public static long kosu(long min, long max, long wari){

		long start;

		if (min % wari == 0){
			start = min;
		} else {
			start = min + (wari - min % wari);
		}

		long mod = (max - start + 1) % wari;
		long kosu = (max - start + 1) / wari;
		if (mod > 0){
			kosu += 1;
		}

		return kosu;
	}

	private static long lcm(long m, long n) {
	    return m * n / gcd(m, n);
	}

	private static long gcd(long m, long n) {
	    if(m < n) return gcd(n, m);
	    if(n == 0) return m;
	    return gcd(n, m % n);
	}
}
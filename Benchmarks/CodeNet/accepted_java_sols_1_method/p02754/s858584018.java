import java.util.*;

class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		long n = in.nextLong();
		long a = in.nextLong();
		long b = in.nextLong();
		long syou = n/(a+b);
		long amari = n%(a+b);
		long result = syou*a;
		if(amari >= a) {
			result = result + a;
		} else {
			result = result + amari;
		}
		System.out.println(result);
		in.close();
	}
}

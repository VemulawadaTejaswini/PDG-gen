import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		long a = sc.nextLong();
		long b = sc.nextLong();
		long c = sc.nextLong();
		long d = sc.nextLong();

		long max = a * c;

		if(a * d > max) {
			max = a * d;
		}

		if(b * c > max) {
			max = b * c;
		}

		if(b * d > max) {
			max = b * d;
		}

		System.out.println(max);
	}

}
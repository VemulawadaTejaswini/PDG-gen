import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		int ans=0;
		Scanner sc = new Scanner(System.in);
		long a = sc.nextInt();
		long b = sc.nextInt();
		long c = sc.nextInt();
		long d = sc.nextInt();

		long ac = a*c;
		long ad = a*d;
		long bc = b*c;
		long bd = b*d;

		long i = 0;
		long j = 0;

		if(ac > ad) {
			i = ac;
		}
		else {
			i = ad;
		}

		if(bc > bd) {
			j = bc;
		}
		else {
			j = bd;
		}

		if(i > j) {
			System.out.println(i);
		}
		else {
			System.out.println(j);
		}
	}
}

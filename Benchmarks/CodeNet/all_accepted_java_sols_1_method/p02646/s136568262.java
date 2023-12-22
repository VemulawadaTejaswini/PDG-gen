import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner sc = new Scanner(System.in);
		long a = sc.nextLong();
		long v = sc.nextLong();
		long b = sc.nextLong();
		long w = sc.nextLong();
		long t = sc.nextLong();
		sc.close();

		long soutaV = v - w;
		if(soutaV<=0L) {
			System.out.println("NO");
			return;
		}

		long soutaD = b - a;
		if(soutaD<=0L) {
			soutaD = -1L * soutaD;
		}

		long distance = soutaV * t;
		if(distance>=soutaD) {
			System.out.println("YES");
		}else {
			System.out.println("NO");
		}

	}
}

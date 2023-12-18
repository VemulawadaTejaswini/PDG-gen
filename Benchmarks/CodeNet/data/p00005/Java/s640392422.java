import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner sc = new Scanner(System.in);

		Long a,b,x,y,GCD,LCM;

		while (sc.hasNext()) {

			a = sc.nextLong();
			b = sc.nextLong();

			x = a;
			y = b;

			GCD = a%b;

			while (!(GCD == 0)) {
				a = y;
				b = GCD;
				GCD = a%b;
			}

			GCD = b;

			LCM = x/GCD*y;

			System.out.println(GCD+ " " +LCM);
		}
	}
}
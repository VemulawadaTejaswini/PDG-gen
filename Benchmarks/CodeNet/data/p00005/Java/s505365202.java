import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner sc = new Scanner(System.in);

		double a,b,x,y,GCD,LCM;
		
		int gcd,lcm;

		while (sc.hasNext()) {
						
			a = sc.nextDouble();
			b = sc.nextDouble();

			x = a;
			y = b;

			GCD = a%b;

			while (!(GCD == 0)) {
				a = y;
				b = GCD;
				GCD = a%b;
			}


			gcd = (int)b;

			lcm = (int)((x*y)/gcd);

			System.out.println(gcd+ " " +lcm);
		}
	}
}
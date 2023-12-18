import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		//底辺a
		double a = sc.nextDouble();

		//斜辺b
		double b = sc.nextDouble();

		//角度C
		double C = sc.nextDouble();

		//高さh
		double h;

		//高さ
		//absinC/2÷a/2=bsinC
		double C2 = Math.toRadians(C);
		h = b * (Math.sin(C2));

		//面積S
		double S;
		S = (a * h) / 2;

		//周の長さL
		double c = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2) - 2 * a * b * Math.cos(Math.toRadians(C)));
		double L = a + b + c;

		System.out.println(S);
		System.out.println(L);
		System.out.println(h);

		sc.close();
	}

}




import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int C = sc.nextInt();
		//角度をラジアンとして数値にする
		//Math.PI→円周率
		double Cc = C * Math.PI / 180;

		double L = a + b + Math.sqrt((a * a) + (b * b) - 2 * a * b * Math.cos(Cc));
		double h = b * Math.sin(Cc);
		double S = a * (b * Math.sin(Cc)) / 2;

		System.out.println(S);
		System.out.println(L);
		System.out.println(h);
	}
}

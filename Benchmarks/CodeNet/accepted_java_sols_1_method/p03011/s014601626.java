import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();//AtoB
		int B = sc.nextInt();//BtoC
		int C = sc.nextInt();//CtoA
		int[] ans = { A + B, A + C, B + C };
		int min = 10000;
		for (int a : ans) {
			if (min > a) {
				min = a;
			}
		}

		System.out.println(min);
		sc.close();
	}
}

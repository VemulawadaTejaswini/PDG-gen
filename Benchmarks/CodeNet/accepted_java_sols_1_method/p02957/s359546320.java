import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		int big = 0;
		int small = 0;
		int tyuou = 0;
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		if(A > B) {
			big = A;
			small = B;
		}else {
			big = B;
			small = A;
		}
		while(big != 0) {
			big--;
			small++;
			if(big == small) {
				tyuou = big;
				break;
			}
		}
		if(tyuou == 0) {
			System.out.println("IMPOSSIBLE");
		}else {
			System.out.println(tyuou);
		}
	}
}
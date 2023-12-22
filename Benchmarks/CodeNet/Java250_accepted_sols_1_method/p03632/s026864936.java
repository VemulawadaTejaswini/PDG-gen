import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		int D = sc.nextInt();
		sc.close();
		if(A <= C) {
			if(D <= B) {
				System.out.println(D - C);
			}else if(C <= B) {
				System.out.println(B - C);
			}else {
				System.out.println(0);
			}
		}else {
			if(D <= A) {
				System.out.println(0);
			}else if(D >= B) {
				System.out.println(B - A);
			}else if(D >= A) {
				System.out.println(D - A);
			}
		}
	}
}

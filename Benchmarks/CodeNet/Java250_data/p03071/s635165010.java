import java.util.Scanner;

class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int A1 = 0;
		int B1 = 0;
		int sum = 0;
		sc.close();
	if(A > B) {
		A1 = A - 1 ;
		if (A1 > B) {
			sum = A + A1;
		}
		else {
			sum = A + B;
		}
	}
	
	else if(A < B) {
		B1 = B - 1;
		if(B1 >A) {
			sum = B + B1;
		}
		else {
			sum = A + B;
		}
	}
	else {
		sum = A+B;
	}
		System.out.print(sum);
	}
}
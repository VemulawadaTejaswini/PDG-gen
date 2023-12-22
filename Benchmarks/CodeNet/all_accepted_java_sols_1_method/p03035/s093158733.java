import java.util.Scanner;

class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int A=Integer.parseInt(sc.next());
		int B=Integer.parseInt(sc.next());
		if(A >= 13) {

		}else if(A <= 5) {
			B = 0;

		} else {
			B /=2;

		}
		System.out.println(B);
	}
}

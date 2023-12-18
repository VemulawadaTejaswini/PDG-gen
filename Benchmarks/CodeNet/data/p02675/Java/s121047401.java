import java.util.Scanner;

class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int N = Integer.parseInt(sc.next());

		while(N/10 > 0) {
			N = N%10;
		}

		if(N == 3) {
			System.out.println("bon");

		} else if(N==0 || N==1 ||N==6||N==8) {
		System.out.println("pon");

		} else {
		System.out.println("hon");

		}
	}
}

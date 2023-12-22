import java.util.Scanner;

class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int N = Integer.parseInt(sc.next());

		boolean  b = false;
		while(N / 10 > 0) {
			if(N % 10 == 7) {
				b = true;
				break;
			} else {
				N = N / 10;
			}
		}

		if(b || N == 7) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}

	}

}


import java.util.Scanner;

class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		double N = Integer.parseInt(sc.next());

		double odd = 0;
		for(int i = 1; i <= N;i++) {
			if(i%2 != 0) odd++;
		}
		System.out.println(odd/N);
	}
}
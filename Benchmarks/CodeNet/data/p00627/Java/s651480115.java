import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner stdIn = new Scanner(System.in);

		while(true) {
			int n = stdIn.nextInt();
			if(n == 0) break;
			int sum = 0;
			for(int r = 0; r < (n / 4); r++) {
				int input = stdIn.nextInt();
				sum += input;
			}
			System.out.println(sum);
		}
	}
}
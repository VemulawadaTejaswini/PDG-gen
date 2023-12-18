import java.util.Scanner;

class Main {

	public static void main(String[] args) {

		int n;

		Scanner stdIn = new Scanner(System.in);

		for(int i = 1; stdIn.hasNext(); i++) {
			n = stdIn.nextInt();
			if(n == 0) {
				break;
			}
			System.out.println("case " + i + ": " + n);
		}
	}

}
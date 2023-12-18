import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		N = N%1000;
		if(N != 0)
			System.out.println(1000 - N);
		else
			System.out.println(0);

	}
}


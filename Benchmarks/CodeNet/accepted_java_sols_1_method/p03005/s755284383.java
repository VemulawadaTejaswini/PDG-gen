import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int N = teclado.nextInt();
		int K = teclado.nextInt();
		double resto = N % K;
		System.out.println((int) resto);
		teclado.close();

	}

}
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int r = teclado.nextInt();
		int A = 3 * (r * r);
		
		System.out.println(A);
		
		teclado.close();
		
	 }
}
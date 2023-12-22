import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		String P = teclado.nextLine();
		int S[] = new int[4];
		for (int x = 0; x < 4; x++) {
			S[x] = P.charAt(x);
		}
			if (S[0] == S[1] || S[1] == S[2] || S[2] == S[3]) {
				System.out.println("Bad");
			}
			
			else {
				System.out.println("Good");
			}
		
		
		teclado.close();

	}

}
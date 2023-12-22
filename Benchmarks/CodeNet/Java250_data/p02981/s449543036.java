import java.util.Scanner;
public class Main{

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int N=teclado.nextInt();
		int A=teclado.nextInt();
		int B=teclado.nextInt();
		if(A*N>B) {
			System.out.println(B);
		}else {
			System.out.println(A*N);
		}
        teclado.close();
	}

}

import java.util.Scanner;
public class Main {
	public static void main (String[]args){
		Scanner teclado = new Scanner (System.in);
		int A, B, C, D, E;
		A=teclado.nextInt();
		B=teclado.nextInt();
		C=teclado.nextInt();
		D=teclado.nextInt();
		E=teclado.nextInt();
		int k = teclado.nextInt();
		if(B-A <= k  && C-A <= k && D-A <= k && E-A <= k && C-B <= k && D-B <= k && E-B <= k && D-C <= k  && E-C <= k  && E-D <= k    ) {
			System.out.println("Yay!");
		}else {
			System.out.println(":(");
		}
 
	 
	 }
	 
	
}
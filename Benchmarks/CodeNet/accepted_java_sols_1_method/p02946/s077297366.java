import java.util.Scanner;

public class Main {

	public static void main (String[] args) {

		Scanner sc = new Scanner (System.in);

		int K = sc.nextInt();
		int X = sc.nextInt();
		
		for (int index=(-1*K)+1; index<K; index++){
		    System.out.print(X+index);
		    System.out.print(" ");
		}

		sc.close();
	}
}
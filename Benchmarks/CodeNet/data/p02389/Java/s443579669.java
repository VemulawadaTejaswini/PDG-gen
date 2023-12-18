import java.util.Scanner;

public class Main {
	private void calc(){
		Scanner scanner = new Scanner(System.in);
		int Leng =scanner.nextInt();
		int High =scanner.nextInt();
		
		int S=Leng*High;
		int P=(Leng+High)*2;
		
		System.out.print(S+" ");
		System.out.println(P);
	}
	
	public static void main(String[] args) {
		Main run =new Main ();
		run.calc();

	}
}
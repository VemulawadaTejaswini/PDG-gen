import java.util.Scanner;


public class Main {
	public static void main(String[] args) {
		//??????????????°
		Scanner sc;		//??\???
		int a=0;
		int b=0;
		int kotae=0;

		sc = new Scanner(System.in);

		for(int i=0; i<3; i++){
			a = sc.nextInt();
			b = sc.nextInt();
			kotae = a + b;

			System.out.println(kotae);
		}
	}
}
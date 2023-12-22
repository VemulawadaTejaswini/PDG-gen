import java.util.Scanner;


public class Main {
	public static void main(String[] args) {
		//??????????????°
		Scanner sc;		//??\???
		int a=0;
		int b=0;
		int kotae=0;
		int i=0;

		sc = new Scanner(System.in);

		while(sc.hasNext()){

			a = sc.nextInt();
			b = sc.nextInt();
			kotae = a + b;

			String skotae = String.valueOf(kotae);
			int keta = skotae.length();

			System.out.println(keta);
			i= i+1;
		}
	}
}
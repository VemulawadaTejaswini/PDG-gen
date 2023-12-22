import java.io.IOException;
import java.util.Scanner;

class Main {

	public static void main(String[] args) throws IOException {

		Scanner scan = new Scanner(System.in);

		int a, b,c;
		int counter = 0;

		a = scan.nextInt();
		b = scan.nextInt();
		c = scan.nextInt();

		for(int i = a; i<=b;i++){

			if((c%i)==0){
				counter++;
			}
		}
		System.out.println(counter);



	}
}
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		int a,f,b;

		a = stdIn.nextInt();
		f = stdIn.nextInt();
		b = stdIn.nextInt();

		if(a > b) {
			System.out.println(0);
		}else if(a + f < b) {
			System.out.println("NA");
		}else {
			System.out.println(b -a);
		}
	}

}


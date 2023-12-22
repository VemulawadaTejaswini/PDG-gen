import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();



		switch(N){
		case 1:
			System.out.println("Hello World");
			break;
		case 2:
			int a = scanner.nextInt();
			int b = scanner.nextInt();
			System.out.println(a+b);
		}




	}

}
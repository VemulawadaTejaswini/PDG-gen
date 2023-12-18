import java.util.Scanner;

class Main {

	public static void main(String[] args) {

		read:
			for(;;){

				Scanner scan = new Scanner(System.in);
				int x = scan.nextInt();
				char ch = scan.next().charAt(0);
				int y = scan.nextInt();

				switch(ch){
				case '+':
					System.out.println(x + y);
					break;
				case '-':
					System.out.println(x - y);
					break;
				case '*':
					System.out.println(x * y);
					break;
				case '/':
					System.out.println(x / y);
					break;
				default:
					break read;
			}
		}
	}
}
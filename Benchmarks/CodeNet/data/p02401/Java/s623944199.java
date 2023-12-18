import java.util.Scanner;

class Main {

	public static void main(String[] args) {

		for(;;){

			Scanner scan = new Scanner(System.in);
			int x = scan.nextInt();
			String str = scan.next();
			int y = scan.nextInt();

			if(str == "+")
				System.out.println(x + y);
			else if(str == "-")
				System.out.println(x - y);
			else if(str == "*")
				System.out.println(x * y);
			else if(str == "/")
				System.out.println(x / y);
			else if(str == "?"){
				scan.close();
				System.exit(0);
                        }
		}
	}
}
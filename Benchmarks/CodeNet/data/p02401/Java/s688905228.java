import java.util.Scanner;

class Main{

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		while(true)
		{
			int a = scan.nextInt();
			String str = scan.next();
			int b = scan.nextInt();

			if(str.equals("?") ) break;

			switch(str)
			{
				case "+":
					System.out.println(a+b);
					break;
				case "-":
					System.out.println(a-b);
					break;
				case "*":
					System.out.println(a*b);
					break;
				case "/":
					System.out.println(a/b);

				default:
					break;
			}
		}

		scan.close();
	}
}
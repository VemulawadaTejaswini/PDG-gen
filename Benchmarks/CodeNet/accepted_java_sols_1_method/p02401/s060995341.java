import java.util.Scanner;

class Main {

	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);

		int str1 = scan.nextInt();
		String str = scan.next();
		int str2 = scan.nextInt();
		
		while(!str.equals("?")){
			int x = 0;
			if((str.equals("+"))){
				x = str1 + str2;
				System.out.println(x);
			}else if((str.equals("-"))){
				x = str1 - str2;
				System.out.println(x);
			}else if((str.equals("*"))){
				x = str1 * str2;
				System.out.println(x);
			}else if((str.equals("/"))){
				x = str1 / str2;
				System.out.println(x);
			}
			str1 = scan.nextInt();
			str = scan.next();
			str2 = scan.nextInt();

		}
		
	}
}
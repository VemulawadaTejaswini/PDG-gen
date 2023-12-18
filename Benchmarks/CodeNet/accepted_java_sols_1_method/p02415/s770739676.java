import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		String str = scan.nextLine();
		
		for(char c : str.toCharArray()) {
			if(c>64 && c<91) System.out.print((char)(c+32));
			else if(c>96 && c<123) System.out.print((char)(c-32));
			else System.out.print((char)c);
		}
		System.out.println();

		scan.close();
	}
}


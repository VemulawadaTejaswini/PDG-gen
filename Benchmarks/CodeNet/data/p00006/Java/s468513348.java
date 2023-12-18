import java.io.IOException;
import java.util.Scanner;

public class Main{

	public static void main(String[] args) throws IOException {
		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine();
		char charArray[] = str.toCharArray();
		for (int i = charArray.length - 1;i >= 0 ; i--) {
			System.out.print(charArray[i]);
			
		}
		System.out.println();
		
	}
	
}
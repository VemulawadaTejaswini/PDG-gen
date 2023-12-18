import java.io.IOException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws IOException {
    	Scanner sc = new Scanner(System.in);

		char Alpa = sc.next().charAt(0);
		
		if(Character.isUpperCase(Alpa))
			System.out.println('A');
		else
			System.out.println('a');

	}

}

import java.io.IOException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws IOException {
    	Scanner sc = new Scanner(System.in);

		char Alpa = sc.next().charAt(0);
		char judge;
		
		if(Character.isUpperCase(Alpa))
			judge = 'A';
		else
			judge = 'a';
			
		System.out.println(judge);

	}

}
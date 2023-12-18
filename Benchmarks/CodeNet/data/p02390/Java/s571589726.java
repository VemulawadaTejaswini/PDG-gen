import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
			
	   Scanner sc = new Scanner(System.in);
	   int S = sc.nextInt();
	  
	   int H = System.out.println(S%60);
	   int M = System.out.println((S%60)%60);
            System.out.println("S:H:M");
		
	}
}
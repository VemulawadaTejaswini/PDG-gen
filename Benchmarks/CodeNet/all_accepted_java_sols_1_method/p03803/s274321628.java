
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws Exception {
		//BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//String line = br.readLine();
		Scanner scan = new Scanner(System.in);
		int a = Integer.parseInt(scan.next());
		int b = Integer.parseInt(scan.next());
		
		if(a==b)
			System.out.println("Draw");
		else if(a==1)
			System.out.println("Alice");
		else if(b==1)
			System.out.println("Bob");
		else if(a>b)
			System.out.println("Alice");
		else 
			System.out.println("Bob");

	}
}
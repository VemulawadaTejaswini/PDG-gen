import java.io.IOException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws IOException{
		Scanner scan = new Scanner(System.in);
		String str = scan.next();
		if(str.contains("7")) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
	}
}
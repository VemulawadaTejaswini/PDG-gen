import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
		Scanner scanner = new Scanner(System.in);
		String str = scanner.nextLine();
		if(str.indexOf("A") != -1 && str.lastIndexOf("Z") != -1){
			System.out.println((str.substring((str.indexOf("A")),str.lastIndexOf("Z")+1)).length());
		}
	}
}
import java.io.IOException;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) throws IOException{
		Scanner sc = new Scanner(System.in);

		int x = sc.nextInt();
		int y = sc.nextInt();
		String z = "";

		if(x>y) {
			z = ">";
		}else if(x<y) {
			z = "<";
		}else {
			z = "==";
		}

		System.out.println("a " + z + " b");

		sc.close();
	}
}

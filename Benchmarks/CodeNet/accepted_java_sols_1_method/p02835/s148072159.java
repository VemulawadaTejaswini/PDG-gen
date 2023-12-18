import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws FileNotFoundException {

		//    	File file = new File("src/in.txt");
		//    	Scanner sc = new Scanner(file);

		Scanner sc = new Scanner(System.in);

		int A1 = sc.nextInt();
		int A2 = sc.nextInt();
		int A3 = sc.nextInt();

		if(A1+A2+A3>=22) {
			System.out.println("bust");
		} else {
			System.out.println("win");
		}
	}
}

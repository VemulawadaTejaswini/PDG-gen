import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws FileNotFoundException {

		//    	File file = new File("src/in.txt");
		//    	Scanner sc = new Scanner(file);

		Scanner sc = new Scanner(System.in);

		int A = sc.nextInt();
		int B = sc.nextInt();
		sc.close();

		if(A>=13) {
			System.out.println(B);
		} else {
			if(A>=6) {
				System.out.println(B/2);
			}  else {
				System.out.println("0");
			}
		}

	}
}

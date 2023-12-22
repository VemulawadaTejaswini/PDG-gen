import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws FileNotFoundException {

		//    	File file = new File("src/in.txt");
		//    	Scanner sc = new Scanner(file);

		Scanner sc = new Scanner(System.in);

		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();

		if(A==B&&A!=C) {
			System.out.println("Yes");
		} else {
			if(A==C&&A!=B) {
				System.out.println("Yes");
			} else {
				if(B==C&&B!=A) {
					System.out.println("Yes");
				} else {
					System.out.println("No");
				}
			}
		}

	}
}

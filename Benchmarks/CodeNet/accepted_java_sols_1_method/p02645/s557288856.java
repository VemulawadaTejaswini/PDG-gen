import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws FileNotFoundException {

		//    	File file = new File("src/in.txt");
		//    	Scanner sc = new Scanner(file);

		Scanner sc = new Scanner(System.in);

		String S = sc.next();

		char[] s = S.toCharArray();
		for(int i=0;i<3;i++) {
			System.out.print(s[i]);
		}
		System.out.println();

	}
}
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws FileNotFoundException {

		//    	File file = new File("src/in.txt");
		//    	Scanner sc = new Scanner(file);

		Scanner sc = new Scanner(System.in);

		int K = sc.nextInt();
		String S = "";

		for(int i=0;i<K;i++) {
			S += "ACL";
		}
		System.out.println(S);

	}
}
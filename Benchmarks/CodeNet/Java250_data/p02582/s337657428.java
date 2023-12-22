import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws FileNotFoundException {

		//    	File file = new File("src/in.txt");
		//    	Scanner sc = new Scanner(file);

		Scanner sc = new Scanner(System.in);

		String S = sc.next();

		int ans = 0;

		switch(S) {
		case "SSS":
			ans = 0;
			break;
		case "SSR":
			ans = 1;
			break;
		case "SRS":
			ans = 1;
			break;
		case "SRR":
			ans = 2;
			break;
		case "RSS":
			ans = 1;
			break;
		case "RSR":
			ans = 1;
			break;
		case "RRS":
			ans = 2;
			break;
		case "RRR":
			ans = 3;
			break;
		}
		System.out.println(ans);

	}
}

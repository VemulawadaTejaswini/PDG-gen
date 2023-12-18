import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws FileNotFoundException {

		//    	File file = new File("src/in.txt");
		//    	Scanner sc = new Scanner(file);

		Scanner sc = new Scanner(System.in);

		String S = sc.next();
		char[] C = S.toCharArray();

		int ans = 0;

		for(int i=0;i<S.length();i++) {

			int x = C[i]-48;
			ans = (ans + x)%9;

		}
		if(ans==0) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}
}
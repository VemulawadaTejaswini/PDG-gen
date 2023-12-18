import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws FileNotFoundException {

		//    	File file = new File("src/in.txt");
		//    	Scanner sc = new Scanner(file);

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int K = sc.nextInt();

		String S = sc.next();

		char[] s = S.toCharArray();

		for(int i=0;i<S.length();i++) {
			if(i==K-1) {
				s[i] = Character.toLowerCase(s[i]);
			}
		}
		S = new String(s);
		System.out.println(S);
	}
}

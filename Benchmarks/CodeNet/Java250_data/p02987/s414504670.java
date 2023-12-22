import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws FileNotFoundException {

		//    	File file = new File("src/in.txt");
		//    	Scanner sc = new Scanner(file);

		Scanner sc = new Scanner(System.in);

		String S = sc.next();
		sc.close();

		char[] s = S.toCharArray();

		int[] count = new int[4];

		for(int i=0;i<S.length();i++) {
			for(int j=0;j<S.length();j++) {
				if(s[i]==s[j]) {
					count[i]++;
				}
			}
		}
		boolean result = true;
		for(int i=0;i<S.length();i++) {
			if(count[i]!=2) {
				result=false;
			}
		}
		if(result) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}
}
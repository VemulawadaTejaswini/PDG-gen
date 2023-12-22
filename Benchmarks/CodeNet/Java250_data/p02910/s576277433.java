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
		boolean ans = true;
		for(int i=0;i<S.length();i++) {
			char c = s[i];
			if((i+1)%2==1) {
				if(c!='R'&&c!='U'&&c!='D') {
					ans = false;
				}
			} else {
				if(c!='L'&&c!='U'&&c!='D') {
					ans = false;
				}
			}
		}
		if(ans) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}
}

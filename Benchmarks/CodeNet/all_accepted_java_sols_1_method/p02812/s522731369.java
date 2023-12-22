import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws FileNotFoundException {

		//    	File file = new File("src/in.txt");
		//    	Scanner sc = new Scanner(file);

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		String S = sc.next();
		sc.close();
		int ans = 0;
		char[] s = S.toCharArray();
		for(int i=0;i<S.length()-2;i++) {
			String a = Character.toString(s[i])+Character.toString(s[i+1])+Character.toString(s[i+2]);
			if(a.equals("ABC")) {
				ans++;
			}
		}
		System.out.println(ans);
	}
}
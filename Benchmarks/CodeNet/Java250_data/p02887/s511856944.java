import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws FileNotFoundException {

		//    	File file = new File("src/in.txt");
		//    	Scanner sc = new Scanner(file);

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		String S = sc.next();
		char[] C = S.toCharArray();
		char x = C[0];
		for(int i=1;i<N;i++) {
			if(C[i]==x) {
				C[i] = 0;
			} else {
				x = C[i];
			}
		}
		int ans = 0;
		for(int i=0;i<N;i++) {
			if(C[i]!=0) {
				ans++;
			}
		}
		System.out.println(ans);

	}
}
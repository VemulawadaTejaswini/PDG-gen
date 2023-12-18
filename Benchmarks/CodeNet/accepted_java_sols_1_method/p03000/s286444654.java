import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws FileNotFoundException {

		//    	File file = new File("src/in.txt");
		//    	Scanner sc = new Scanner(file);

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int X = sc.nextInt();
		int ans = 1;
		int D = 0;
		for(int i=0;i<N;i++) {
			D += sc.nextInt();
			if(D<=X) {
				ans++;
			}
		}
		System.out.println(ans);
	}
}
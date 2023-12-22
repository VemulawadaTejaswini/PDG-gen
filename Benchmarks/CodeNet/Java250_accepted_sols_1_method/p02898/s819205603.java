import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws FileNotFoundException {

		//    	File file = new File("src/in.txt");
		//    	Scanner sc = new Scanner(file);

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int K = sc.nextInt();
		int ans = 0;
		for(int i=0;i<N;i++) {
			if(sc.nextInt()>=K) {
				ans++;
			}
		}
		sc.close();
		System.out.println(ans);

	}
}
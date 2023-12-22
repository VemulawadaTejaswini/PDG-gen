import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws FileNotFoundException {

		//    	File file = new File("src/in.txt");
		//    	Scanner sc = new Scanner(file);

		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int min = sc.nextInt();
		int ans = 1;
		for(int i=1;i<N;i++) {
			int x = sc.nextInt();
			if(x<min) {
				min = x;
				ans++;
			}
		}
		System.out.println(ans);
	}
}
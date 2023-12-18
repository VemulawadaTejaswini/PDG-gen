import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws FileNotFoundException {

		//    	File file = new File("src/in.txt");
		//    	Scanner sc = new Scanner(file);

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int[] d = new int[N];
		for(int i=0;i<N;i++) {
			d[i] = sc.nextInt();
		}
		int ans = 0;
		for(int i=0;i<N-1;i++) {
			for(int j=i+1;j<N;j++) {
				ans += d[i]*d[j];
			}
		}
		System.out.println(ans);
	}
}
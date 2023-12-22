import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws FileNotFoundException {

		//    	File file = new File("src/in.txt");
		//    	Scanner sc = new Scanner(file);

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int K = sc.nextInt();
		int Q = sc.nextInt();
		int[] p = new int[N+1];
		Arrays.fill(p, K);
		int border = 0;
		for(int i=0;i<Q;i++) {
			int x = sc.nextInt();
			p[x]++;
			border++;
		}
		for(int i=1;i<=N;i++) {
			if(p[i]>border) {
				System.out.println("Yes");
			} else {
				System.out.println("No");
			}
		}
	}
}
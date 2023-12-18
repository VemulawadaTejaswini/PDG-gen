import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws FileNotFoundException {

		//    	File file = new File("src/in.txt");
		//    	Scanner sc = new Scanner(file);

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int[] A = new int[N];

		for(int i=0;i<N;i++) {
			A[i] = sc.nextInt();
		}
		int height = A[0];
		long ans = 0;
		for(int i=1;i<N;i++) {
			if(A[i]>height) {
				height = A[i];
			} else {
				ans += height - A[i];
			}
		}
		System.out.println(ans);

	}
}
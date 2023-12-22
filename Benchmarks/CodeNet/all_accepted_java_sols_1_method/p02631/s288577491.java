import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws FileNotFoundException {

		//    	File file = new File("src/in.txt");

		//コード
		//    	Scanner sc = new Scanner(file);
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int[] a = new int[N];
		int X = 0;
		for (int i = 0; i < N; i++) {
			a[i] = sc.nextInt();
			X = X ^ a[i];
		}
		for (int i=0;i<N;i++) {
			if(i<N-1) {
				System.out.print(X^a[i]);
				System.out.print(" ");
			} else {
				System.out.println(X^a[i]);
			}
		}
	}
}
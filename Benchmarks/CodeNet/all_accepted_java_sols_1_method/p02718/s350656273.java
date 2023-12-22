import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws FileNotFoundException {

		//    	File file = new File("src/in.txt");
		//    	Scanner sc = new Scanner(file);

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int M = sc.nextInt();
		int[] A = new int[N];
		int sum = 0;
		for(int i=0;i<N;i++) {
			A[i] = sc.nextInt();
			sum += A[i];
		}
		sc.close();
		int anscnt = 0;
		for(int i=0;i<N;i++) {
			double p = A[i];
			double q = (double)sum/(double)(4*M);
			if(p>=q) {
				anscnt++;
			}
		}
		if(anscnt>=M) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}

	}
}
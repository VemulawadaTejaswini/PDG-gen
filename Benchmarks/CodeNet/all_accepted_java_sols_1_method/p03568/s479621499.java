import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Scanner;

public class Main{
	static Scanner sc;

	public static void main(String[] args) throws Exception {
		//InputStream in = new FileInputStream("src/input.txt");
		InputStream in = System.in;
		//PrintStream out = new PrintStream("src/output.txt");

		//System.setOut(out);

		sc = new Scanner(in);

		int N = sc.nextInt();
		int[] A = new int[N];

		int count = 1;

		for(int i = 0; i < N; i++){
			A[i] = sc.nextInt();
			if(A[i] % 2 == 0){
				count *= 2;
			}
		}

		System.out.println((int)((Math.pow(3, N))-count));

		//out.close();
	}
}
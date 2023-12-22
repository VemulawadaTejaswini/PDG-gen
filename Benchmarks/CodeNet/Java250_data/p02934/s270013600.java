import java.io.FileNotFoundException;
import java.math.BigDecimal;
import java.util.Scanner;

public class Main {
	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws FileNotFoundException {

		//    	File file = new File("src/in.txt");
		//    	Scanner sc = new Scanner(file);

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int[] A = new int[N];
		BigDecimal times = BigDecimal.valueOf(1);
		for(int i=0;i<N;i++) {
			A[i]=sc.nextInt();
			times = times.multiply(BigDecimal.valueOf(A[i]));
		}
		BigDecimal q = BigDecimal.valueOf(0);
		for(int i=0;i<N;i++) {
			BigDecimal x = times.divide(BigDecimal.valueOf(A[i]));
			q = q.add(x);
		}
		System.out.println(times.divide(q,6, BigDecimal.ROUND_HALF_UP));

	}
}

import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws FileNotFoundException {

		//    	File file = new File("src/in.txt");
		//    	Scanner sc = new Scanner(file);

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int[] B = new int[N-1];
		for(int i=0;i<N-1;i++) {
			B[i]=sc.nextInt();
		}
		sc.close();
		if(N==1) {
			System.out.println(2*B[0]);
		} else {
			int ans = 0;
			for(int i=0;i<=N-3;i++) {
				ans += Math.min(B[i], B[i+1]);
			}
			ans += B[0];
			ans += B[N-2];
			System.out.println(ans);
		}
	}
}

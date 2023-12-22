import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws FileNotFoundException {

//    	File file = new File("src/in.txt");

        //コード
//    	Scanner sc = new Scanner(file);
    	Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] A = new int[N];
		for(int i=0;i<N;i++) {
			A[i] = Integer.parseInt(sc.next());
		}
		Arrays.sort(A);
		int[] B = new int[N];
		for(int i=0;i<N;i++) {
			B[i] = A[N-i-1];
		}
		long ans = 0;
		for(int i=0;i<=N-2;i++) {
			if(i==0) {
				ans += B[0];
			} else {
				ans += B[(i+1)/2];
			}
		}
		System.out.println(ans);
    }
}

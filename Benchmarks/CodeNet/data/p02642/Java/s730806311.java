import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws FileNotFoundException {

		//    	File file = new File("src/in.txt");

		//コード
		//    	Scanner sc = new Scanner(file);
		Scanner sc = new Scanner(System.in);

		int N = Integer.parseInt(sc.next());
		int[] A = new int[N];
		for (int i = 0; i < N; i++) {
			A[i] = Integer.parseInt(sc.next());
		}
		int ans = 0;
		Arrays.sort(A);
		for(int i=0;i<N;i++) {
			boolean flg = false;
			for(int j=0;j<N;j++) {
				if(A[j]>A[i]) {
					break;
				} else {
					if(i!=j&&A[j]<=A[i]) {
						if(A[i]%A[j]==0) {
							flg = true;
							break;
						}
					}
				}
			}
			if(flg==true) {
				ans++;
			}
		}
		System.out.println(N-ans);
	}
}
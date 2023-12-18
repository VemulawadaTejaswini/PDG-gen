import java.io.FileNotFoundException;
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
		int ans =0;
		for(int i=0;i<N;i++) {
			boolean flg = false;
			for(int j = 1;j<=Math.sqrt(A[i]);j++) {
				if(A[i]%j==0) {
					for(int k=0;k<N;k++) {
						if(i!=k&&((A[k]==j)||(A[k]==A[i]/j))) {
							flg = true;
							break;
						}
					}
				}
				if(flg==true) {
					break;
				}
			}
			if(flg==true) {
				ans++;
			}
		}
		System.out.println(N-ans);
	}
}

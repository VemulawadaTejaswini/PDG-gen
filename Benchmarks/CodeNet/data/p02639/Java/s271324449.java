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
		int[] cnt = new int[1000005];
		for(int i=0;i<N;i++) {
			if(cnt[A[i]] != 0) {
				cnt[A[i]]=2;
				continue;
			}
			int x = A[i];
			for(int j=x;j<1000005;j+=x) {
				cnt[j]+=1;
			}
		}
		int ans = 0;
		for(int i=0;i<N;i++) {
			if(cnt[A[i]]==1) {
				ans++;
			}
		}
		System.out.println(ans);
	}
}
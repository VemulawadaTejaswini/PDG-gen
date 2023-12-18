import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner scan =  new Scanner(System.in);
		int N = scan.nextInt();
		long[] arr = new long[1000000];
		long ans = 0;
		for(int i=0;i<N;i++){
			int c = scan.nextInt();
			arr[c]++;
			ans+=c;
		}
		int d = scan.nextInt();
		for(int i=0;i<d;i++){
			int p = scan.nextInt();
			int q = scan.nextInt();
			ans += (q-p)*arr[p];
			arr[q]+=arr[p];
			arr[p]=0;
			System.out.println(ans);
		}
	}
}

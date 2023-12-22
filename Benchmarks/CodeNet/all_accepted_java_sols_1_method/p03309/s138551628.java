import java.util.Arrays;
import java.util.Scanner;

class Main{

	static char[][] map;
	static int H;
	static int W;

	public static void main(String[] args) {



		Scanner sc = new Scanner(System.in);			//文字の入力
		int N =sc.nextInt();
		long[] a = new long[N];
		
		for(int i = 0;i < N;i++){
			a[i] = sc.nextInt()-(i+1);
		}
		
		long[] c = a.clone();
		Arrays.sort(c);
		long mid = c[N/2];
		

		
		long ans =0 ;
		for(int i = 0;i < N;i++){
			ans += Math.abs(a[i]-mid);
		}
		System.out.println(ans);

	}
}




import java.util.Arrays;
import java.util.Scanner;


public class Main {


	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int res = 0;
		int[] n = new int[N];
		Arrays.fill(n, 0);

		for(int i=0;i<N;i++) {

			n[i]=sc.nextInt();
			int max = n[0];
			for(int s =0;s<i;s++) {
				if(max<n[s]) {
					max = n[s];
				}
			}
			if(n[i]>=max) {
			
				res++;
			}

		}
		System.out.println(res);




	}
}
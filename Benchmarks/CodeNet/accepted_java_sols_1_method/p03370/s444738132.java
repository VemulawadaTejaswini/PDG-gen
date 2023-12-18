import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		int X = in.nextInt();
		int[] m = new int[N] ;
		for(int i=0;i<N;i++) {
			 m[i] = in.nextInt();
		}
		int min =1001;
		int sum=0;
		for(int i=0;i<N;i++) {
			sum+=m[i];
			min=Math.min(min, m[i]);
		}
		int a=(X-sum)/min;
		int ans=a+N;
		System.out.println(ans);
	}

}

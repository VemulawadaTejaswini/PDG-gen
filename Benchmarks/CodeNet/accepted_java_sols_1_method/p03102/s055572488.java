import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N=sc.nextInt(),M=sc.nextInt(),C=sc.nextInt(),ans=0;
		int[]b = new int[M];
		for(int i=0; i<M; i++) b[i]=sc.nextInt();

		int num=0;
		for(int i=0; i<N; i++) {
			for(int j=0; j<M; j++) {
				num += sc.nextInt()*b[j];
			}
			if(num+C > 0) ans++;
			num=0;
		}
		System.out.println(ans);
	}
}

import java.util.Arrays;
import java.util.Scanner;

//Walking Santa
public class Main{

	void run(){
		Scanner sc = new Scanner(System.in);
		sc.nextInt(); sc.nextInt();
		int n = sc.nextInt();
		int[] x = new int[n], y = new int[n];
		int[][] p = new int[n][2];
		for(int i=0;i<n;i++){
			x[i] = p[i][0] = sc.nextInt(); y[i] = p[i][1] = sc.nextInt();
		}
		Arrays.sort(x);
		Arrays.sort(y);
		int px = x[(n-1)/2], py = y[(n-1)/2];
		long res = 0, max = 0;
		for(int i=0;i<n;i++){
			long len = Math.abs(px-p[i][0])+Math.abs(py-p[i][1]);
			res+=2*len;
			max = Math.max(max, len);
		}
		System.out.println(res-max);
		System.out.println(px+" "+py);
	}
	
	public static void main(String[] args) {
		new Main().run();
	}
}
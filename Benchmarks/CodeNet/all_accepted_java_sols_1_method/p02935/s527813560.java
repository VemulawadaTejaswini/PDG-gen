import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws FileNotFoundException {

		//    	File file = new File("src/in.txt");
		//    	Scanner sc = new Scanner(file);

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		double ans = 0;
		int[] v = new int[N];
		for(int i=0;i<N;i++) {
			v[i] = sc.nextInt();
		}
		Arrays.sort(v);
		for(int i=0;i<N;i++) {
			if(i==0) {
				ans = v[i];
			} else {
				ans = (ans+v[i])/2.0;
			}
		}
		System.out.printf("%.5f",ans);


	}
}
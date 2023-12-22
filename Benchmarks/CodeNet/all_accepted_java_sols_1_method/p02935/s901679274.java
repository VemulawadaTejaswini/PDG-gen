import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int n = stdIn.nextInt(); //具材
		int [] v = new int[n];
		
		for(int i = 0; i < n; i++) {
			v[i] = stdIn.nextInt();
		}
		
		Arrays.sort(v);
		
		double [] tmp = new double[n-1];
		
		tmp[0] = (v[0]+v[1])/2.0;
		
		
		for(int i = 1; i < n-1; i++) {
			tmp[i] = (tmp[i-1]+v[i+1])/2;
		}
		System.out.println(tmp[n-2]);
		
	}
}

import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n= scan.nextInt();
		double v[]=new double[n];
		for(int i=0;i<n;i++) {
			v[i]=scan.nextDouble();
		}
		scan.close();
		Arrays.sort(v);

		double ave=(v[0]+v[1])/2;
		for(int i=1;i<n-1;i++) {
			ave=(ave+v[i+1])/2;
		}
		System.out.println(ave);
	}

}

import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int x[]=new int[n];
		for(int i=0;i<n;i++) {
			x[i]=scan.nextInt();
		}
		scan.close();
		long  min = Integer.MAX_VALUE;
		Arrays.sort(x);
		for(int i=1; i<=x[n-1];i++) {
			long sum =0;
			for(int j=0;j<n;j++) {
				sum += (x[j]-i)* (x[j]-i);
			}
			if(min > sum) min = sum;
		}
		System.out.println(min);
	}
}

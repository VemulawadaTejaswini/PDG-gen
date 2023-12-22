import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n=sc.nextInt();
		int[] ai=new int[n];
		long sum=0;

		for (int i=0;i<n;i++) {
			ai[i]=sc.nextInt();
			sum+=ai[i];
		}

		Arrays.sort(ai);
		System.out.println(ai[0]+" "+ai[n-1]+" "+sum);
	}
}

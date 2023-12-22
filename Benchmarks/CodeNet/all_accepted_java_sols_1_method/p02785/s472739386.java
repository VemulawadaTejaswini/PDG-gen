import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n= sc.nextInt(),k=sc.nextInt();
		long[] a=new long[n];
		long sum=0,count=0;
		for(int i=0;i<n;i++) {
			a[i]=sc.nextLong();
		}
		Arrays.parallelSort(a);
		for(int i=0;i<n-k;i++) {
			sum+=a[i];
		}
		//System.out.println(sum);

		System.out.println(sum);

	}

}

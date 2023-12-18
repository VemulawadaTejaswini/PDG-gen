import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int[] a = new int[n];

		for(int i=0;i<n;i++)a[i]=sc.nextInt();
		long sum=0,min=Long.MAX_VALUE;
		for(int i=1;i<100;i++) {
			for(int j=0;j<n;j++) {
				sum+=Math.pow(a[j]-i, 2);
			}
			min=Math.min(min, sum);
			sum=0;
		}
		System.out.println(min);
	}
}


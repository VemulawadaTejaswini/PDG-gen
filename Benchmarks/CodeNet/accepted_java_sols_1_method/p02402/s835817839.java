import java.util.Scanner;

class Main{

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int n = scan.nextInt();
		int[] a = new int[n];
		long sum=0;
		int max=-1000000,min=1000000;

		for(int i=0; i<n; i++)
		{
			a[i] = scan.nextInt();
			sum += a[i];

			max = Math.max(max, a[i]);
			min = Math.min(min, a[i]);
		}

		System.out.printf("%d %d %d\n", min, max, sum);

		scan.close();
	}
}
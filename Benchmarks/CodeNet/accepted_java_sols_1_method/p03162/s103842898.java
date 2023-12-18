import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		int[] b = new int[n];
		int[] c = new int[n];

		for (int i=0;i<n;i++) {
			a[i]=sc.nextInt();
			b[i]=sc.nextInt();
			c[i]=sc.nextInt();
		}

		int[] ansA = new int[n];
		int[] ansB = new int[n];
		int[] ansC = new int[n];

		ansA[0]=a[0];
		ansB[0]=b[0];
		ansC[0]=c[0];

		for (int i=1;i<n;i++) {
			ansA[i]=Math.max(ansB[i-1], ansC[i-1])+a[i];
			ansB[i]=Math.max(ansC[i-1], ansA[i-1])+b[i];
			ansC[i]=Math.max(ansA[i-1], ansB[i-1])+c[i];
		}
		System.out.println(Math.max(Math.max(ansA[n-1], ansB[n-1]), ansC[n-1]));
	}

}
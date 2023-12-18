import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n=scan.nextInt();
		int a[]=new int[n];
		int b[]=new int[n];
		for(int i=0;i<n;i++) {
			a[i]=scan.nextInt();
			b[i]=a[i];
		}
		scan.close();
		Arrays.sort(b);
		for(int i=0;i<n;i++) {
			System.out.println((a[i]!=b[n-1])?b[n-1]:b[n-2]);
		}
	}
}
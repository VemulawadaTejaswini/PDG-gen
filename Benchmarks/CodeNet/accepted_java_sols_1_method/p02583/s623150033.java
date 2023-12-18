import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] a= new int[n];
		for(int i=0;i<n;i++) {
			a[i]=scan.nextInt();
		}
		Arrays.sort(a);
		int c=0;
		for(int i=0;i<n;i++) {
			for(int j=0;j<i;j++) {
				for(int k=0;k<j;k++) {
					if(a[k]!=a[j] && a[i]!=a[j] && a[k]+a[j]>a[i]) {
						c++;
					}
				}
			}
		}
		System.out.println(c);
	}

}

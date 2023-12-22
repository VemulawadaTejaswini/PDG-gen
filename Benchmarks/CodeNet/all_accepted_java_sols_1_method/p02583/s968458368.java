
import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner ob=new Scanner(System.in);
		int n=ob.nextInt();
		int a[]=new int[n];
		for (int i=0; i<n; i++) {
			a[i]=ob.nextInt();
		}
		Arrays.sort(a);
		// for(int i=0;i<=k;i++){System.out.println(a[i]);}
		int count=0;
		out:
		for (int i=0; i<n-2; i++) {
			for (int j=i+1; j<n-1; j++) {
				for (int k=j+1; k<n; k++) {
					if (a[i]!=a[j]&&a[j]!=a[k]&&a[i]!=a[k]) {
						if ((a[i]+a[j])>a[k]&&a[j]+a[k]>a[i]&&a[i]+a[k]>a[j]) {
							count++;
						}

					}
				}
			}
		}
		System.out.println(count);
	}
}

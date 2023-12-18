import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		long a[] = new long[N];
		for (int i=0;i<N;i++) {
			a[i] = sc.nextLong();
		}
		int count =0;
		for (int i=0;i<N;i++) {
			for (int j=i+1;j<N;j++) {
				for (int k=j+1;k<N;k++) {
					if (a[i]+a[j]>a[k]&&a[i]+a[k]>a[j]&&a[k]+a[j]>a[i]&&a[i]!=a[j]&&a[j]!=a[k]&&a[i]!=a[k]) {
						count ++;
					}
				}
			}
		}
		System.out.println(count);
	}
}
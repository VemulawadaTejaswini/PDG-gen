import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
	long a[]=new long[n];
for(int i=0;i<=n-1;i++){
	a[i]=sc.nextLong();
}
System.out.println(haimax(a)-haimin(a));
	}public static int haimax(int a[]) {
		int d;
		d = a[0];
		for (int i = 0; i <= a.length - 1; i++) {
			if (d <= a[i]) {
				d = a[i];
			}

		}
		return d;
	}
	public static long haimax(long a[]) {
		long d;
		d = a[0];
		for (int i = 0; i <= a.length - 1; i++) {
			if (d <= a[i]) {
				d = a[i];
			}

		}
		return d;
	}

public static long haimin(long a[]) {
		long d;
		d = a[0];
		for (int i = 0; i <= a.length - 1; i++) {
			if (d >= a[i]) {
				d = a[i];
			}

		}
		return d;
	}
}
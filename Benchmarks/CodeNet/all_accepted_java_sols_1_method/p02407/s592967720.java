import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int [] a;
		a = new int[n];
		for(int i=0;i<n;i++) {
			a[i] = sc.nextInt();
		}
		for(int i=0;i<n-1;i++) {
			System.out.printf("%d ",a[n-1-i]);
		}
		System.out.printf("%d\n",a[0]);
	}
}


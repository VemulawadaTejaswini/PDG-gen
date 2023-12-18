import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		long min=0, max=0, sum=0;
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a= new int[n];
		for (int i=0; i < n; i++) {
			a[i] = sc.nextInt();
			if (i == 0) {
				min = a[i];
				max = a[i];
				sum = a[i];
			} else {
				if (min > a[i]) {
					min = a[i];
				}
				if (max < a[i]) {
					max = a[i];
				}
				sum = sum + a[i];
			}
		}
		System.out.println(min + " " + max + " " + sum);
	}

}
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		int max = -1000000, min = 1000000;
		long counter = 0;
		try (Scanner sc = new Scanner(System.in)) {
			int n = sc.nextInt();
			int a[] = new int[n];
			for(int i = 0; i < n; i++) {
				a[i] = sc.nextInt();
				if(a[i] >= max) {
					max = a[i];
				}
				if(a[i] <= min) {
					min = a[i];
				}
				counter =  counter + a[i];
			}
			System.out.println(String.format("%d %d %d", min, max, counter));
		}
	}
}


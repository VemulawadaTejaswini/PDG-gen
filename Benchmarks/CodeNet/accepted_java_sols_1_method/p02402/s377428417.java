import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		for(int i = 0; i < n; i++)a[i] = sc.nextInt();
		int min = a[0];
		int max = a[0];
		long sum = 0;
		//min
		for(int i = 0; i < n-1; i++) {
			min = Math.min(min, a[i + 1]);
		}
		//max
		for(int i = 0; i < n-1; i++) {
			max = Math.max(max, a[i + 1]);
		}
		//sum
		for(int b : a)sum +=b;
		System.out.println(min+" "+max+" "+sum);
		sc.close();
	}
}


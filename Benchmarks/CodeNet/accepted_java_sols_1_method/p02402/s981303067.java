import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		long n, a, i, sum, max, min;
		
		Scanner scan = new Scanner(System.in);
		
		n = scan.nextInt();
		a = scan.nextInt();
		max = a;
		min = a;
		sum = a;
		
		for(i = 1; i < n; i++) {
			a = scan.nextInt();
			sum += a;
			if(a > max) max = a;
			if(a < min) min = a;
		}
		
		System.out.printf("%d ", min);
		System.out.printf("%d ", max);
		System.out.printf("%d\n", sum);
		
	}

}

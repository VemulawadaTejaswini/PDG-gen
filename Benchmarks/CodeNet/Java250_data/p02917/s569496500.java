import java.util.Scanner;
public class Main{

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int []a = new int [n];
		int []b = new int [n+1];
		
		b[0] = 10000000; b[n] = 100000000;
		
		for(int i = 1; i < n ; i++) {
		   b[i] = sc.nextInt();
		}
		int sum = 0;
		for(int i = 0 ; i < n ; i++) {
			a[i] = Math.min(b[i], b[i+1]);
			sum += a[i];
		}
		System.out.println(sum);

	}

}

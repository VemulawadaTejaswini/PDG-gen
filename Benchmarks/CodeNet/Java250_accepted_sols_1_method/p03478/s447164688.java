import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int min = sc.nextInt();
		int max = sc.nextInt();
		int a [] = new int[n];
		int sum = 0;
		for(int i = 0; i < n; i++) {
			a[i] = i+1;
			int e = a[i];
			int dig = 0;
			while(e != 0) {
				dig += e %10;
				e /= 10;
			}
			if(min <= dig && dig <= max) {
				sum += a[i];
			}
		}
		System.out.println(sum);
	}
}

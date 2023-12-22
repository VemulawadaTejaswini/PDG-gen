import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int d[] = new int[N];
		for(int i = 0; i < N; i++) { 
			d[i] = sc.nextInt();
		}
		int sum = 0;
		for(int i = 0; i < N; i++) {
			for(int j = 0; j < N; j++) {
				sum += d[i] * d[j];
			}
		}
		for(int i = 0; i < N; i++) {
			sum -= Math.pow(d[i], 2);
		}
		sum /= 2;
		System.out.println(sum);
	}

}

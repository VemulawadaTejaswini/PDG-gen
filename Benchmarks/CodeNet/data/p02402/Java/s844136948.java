import java.util.Scanner;

public class Main{
	public static void main(String args[]){

		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int max = -1;
		int min = 10000;
		int sum = 0;

		int[] x = new int[N];

		//System.out.println(N);

		for(int i = 0; i < N ; i++){
			x[i] = sc.nextInt();

			max = Math.max(max,x[i]);
			min = Math.min(min,x[i]);
			sum = sum + x[i];
		}
		System.out.println(min + " " + max + " " + sum);
	}
}
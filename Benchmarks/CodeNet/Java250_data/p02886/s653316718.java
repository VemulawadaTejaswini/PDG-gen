import java.util.Scanner;

public class Main {
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] d  = new int[101];
		
		for(int i = 0; i < N; i++) {
			d[i] = sc.nextInt();
		}
		
		int x = 0;
		int sum = 0;
		
		for(int i = 0; i < N; i++) {
			for(int j = i+1; j < N; j++) {
				x = d[i] * d[j];
				sum += x;
			}
		}		
		System.out.println(sum);
		
		sc.close();
	}
}
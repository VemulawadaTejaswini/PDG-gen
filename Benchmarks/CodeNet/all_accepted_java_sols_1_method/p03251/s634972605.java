import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		int[] xCity = new int[N+1];
		int[] yCity = new int[M+1];
		xCity[0] = sc.nextInt();
		yCity[0] = sc.nextInt();
		for(int i=1; i<=N; i++) {
			xCity[i] = sc.nextInt();
		}
		for(int i=1; i<=M; i++) {
			yCity[i] = sc.nextInt();
		}
		Arrays.sort(xCity);
		Arrays.sort(yCity);
		if(xCity[N] < yCity[0]) {
			System.out.println("No War");
		} else {
			System.out.println("War");
		}
			
		
	}

}

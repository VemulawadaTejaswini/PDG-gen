import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[]args) {
		try(Scanner scan = new Scanner(System.in)){
			
			int N = scan.nextInt();
			int K = scan.nextInt();
			int[]p = new int[N];
			for(int i = 0;i<N;i++)p[i] = scan.nextInt();
			
			Arrays.sort(p);
			
			long goukei = 0;
			
			for(int i = 0;i<K;i++) {
				goukei+=p[i];
			}
			
			System.out.println(goukei);
			
		}
		
		
	}
		

}

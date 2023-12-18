import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		final long N = sc.nextLong();
		final int K = sc.nextInt();
		
		for(int i = 0; i < K; i++){
			long x = sc.nextLong() - 1;
			long y = sc.nextLong() - 1;
			
			if(N/2 < x){
				x = (N - 1) - x;
			}
			
			if(N/2 < y){
				y = (N - 1) - y;
			}
			
			System.out.println(Math.min(x, y) % 3 + 1);
		}
		
	}

}
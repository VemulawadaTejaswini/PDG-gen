import java.util.Scanner;
public class Main{

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		long N = sc.nextLong();
		
		double n = (Math.sqrt(N+(1/4)));
		
		long count = 0;
		
		for(int m =1; m <= n; m++){
			if((N % m == 0)){
				if(N / m > m + 1) {
				count += (N/m - 1);
				}
			}
		}
		System.out.println(count);
	}
}

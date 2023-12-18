import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println();
		
		while(sc.hasNext()){
			int N = 1;
			double v = sc.nextDouble();
			for( ; ; N++){
				if (5*(N-1)*2*9.8 >= v*v) break;
			}
			System.out.println(N);
		}
		sc.close();
	}
}
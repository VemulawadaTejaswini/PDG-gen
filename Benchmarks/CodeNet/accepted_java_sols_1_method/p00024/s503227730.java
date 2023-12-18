import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(sc.hasNext()){
			int N = 1;
			double v = sc.nextDouble();
			for( ; ; N++){
				if ((N-1)*98 >= v*v) break;
			}
			System.out.println(N);
		}
		sc.close();
	}
}
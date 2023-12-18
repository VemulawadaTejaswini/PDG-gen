import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		sc.close();

		for(double d = N;d > 0;d--){
			if((int)(d * 1.08) == N){
				System.out.println((int)d);
				return;
			}
		}
		System.out.println(":(");
	}
}
import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		double N = stdIn.nextDouble();
		double ans = 0;
		if(N % 2 == 0){
			ans = 0.5;
		}
		else{
			ans = (N + 1) / 2 / N;
		}
		System.out.printf("%.10f",ans);

		stdIn.close();
	}
}

import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		int N = stdIn.nextInt();
		double A[] = new double[N];
		double sum = 0;
		for(int i = 0; i < N; i++){
			A[i] = stdIn.nextDouble();
			sum = sum + 1.0/A[i];
		}
	    sum = 1.0 / sum;
	    System.out.println(sum);
		stdIn.close();
	}
}

import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		double answer = 0;
		for(int i=0; i<N; i++) {
			double A = sc.nextDouble();
			answer += 1.0/A;
		}
		answer = 1.0/answer;
		System.out.println(answer);
	}
}
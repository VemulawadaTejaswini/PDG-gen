import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.next());
		double sum = 0;
		for(int i=1; i<=n; i++) {
			double a = sc.nextDouble();
			sum += (1/a);
		}
		System.out.println(1/sum);
	}
}
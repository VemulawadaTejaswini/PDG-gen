import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		int count = scan.nextInt();
		double sum = 1;
		double max = Math.pow(10, 18);

		for(int i = 0 ; i < count ; i++) {
			double value = scan.nextDouble();
			sum *= value;
		}
		scan.close();
		if(sum <= max) System.out.println(sum);
		else System.out.println(-1);
	}
}

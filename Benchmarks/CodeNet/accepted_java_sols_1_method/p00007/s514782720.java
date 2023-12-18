import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int week = sc.nextInt();
		double debt = 100000;
		for(int i = 0 ; i < week ; i++){
			debt = debt * 1.05;
			double a = debt/1000;
			a = Math.ceil(a);
			debt = a * 1000;
		}

		System.out.printf("%.0f",debt);
System.out.println();
		sc.close();
	}

}
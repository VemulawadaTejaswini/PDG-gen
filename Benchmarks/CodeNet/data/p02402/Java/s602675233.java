import java.util.Scanner;


public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int min = 0;
		int max = 0;
		int sum = 0;
		int check;
		for (int i = 0; i < n; i++) {
			check = scan.nextInt();
			
			if (min > check || i == 0) {
				min = check;
			}
			if (max < check || i == 0) {
				max = check;
			}
			sum += check;
		}
		System.out.println(min + " " + max + " " + sum);
	}

}
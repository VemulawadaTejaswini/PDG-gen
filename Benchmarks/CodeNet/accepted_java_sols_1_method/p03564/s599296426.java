import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int result = 1;
		
		int nVal = sc.nextInt();
		
		int kVal = sc.nextInt();
		
		for (int i = 0; i < nVal; i++) {
			if (result < kVal) {
				result *= 2;
			} else {
				result += kVal;
			}
		}
		System.out.println(result);
	}
}

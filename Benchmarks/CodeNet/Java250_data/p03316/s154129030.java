import java.util.Scanner;

public class Main {

	@SuppressWarnings("resource")
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int s=calcDigitSum(n);
		
		String ans=(n%s==0)?"Yes":"No";
		System.out.println(ans);
	}
	
	private static int calcDigitSum(int n) {
		int digitSum = 0;
		for (int i = n; i > 0; i /= 10) {
			digitSum += i % 10;
		}
		return digitSum;
	}
}

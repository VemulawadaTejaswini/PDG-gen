import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double a = sc.nextDouble();
		
		double men = a * a * Math.PI;
		double ensyu = a * 2 * Math.PI;
		
		String str1 = String.format("%.5f", men);
		String str2 = String.format("%.5f", ensyu);
		
		System.out.println(str1 +" "+ str2);
	}
}
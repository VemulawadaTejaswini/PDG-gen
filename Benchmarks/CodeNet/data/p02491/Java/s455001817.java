import java.util.Arrays;
import java.util.Scanner;

class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double a []= {sc.nextDouble(),sc.nextDouble()};
		System.out.println((int)a[0]/a[1] + " " + (int)a[0]%a[1] + " " + a[0]/a[1]);
		
		
	}
}
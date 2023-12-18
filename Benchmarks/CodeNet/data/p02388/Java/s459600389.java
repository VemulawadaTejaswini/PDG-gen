import java.util.Scanner;

public class Main{
	public static void main(String[] args) throws java.io.IOException{
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		sc.close();
		double x = Double.valueOf(num).doubleValue();
		x = Math.pow(x,3);
		int result = (int)x;
		System.out.println(result);
	}
}
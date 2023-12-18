import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double p = Math.PI;
		Scanner sc = new Scanner(System.in);
		double hankei = sc.nextDouble();
		double area = hankei * hankei * p;
		double circum = 2 * hankei * p;
		System.out.println(area + " " + circum);
	}

}
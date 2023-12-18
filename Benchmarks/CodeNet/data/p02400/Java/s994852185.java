import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		Double r = sc.nextDouble();
		Double pi = Math.PI;
		Double area = r * r * pi;
		Double length = 2 * pi * r;
		System.out.printf("%f %f \n",area,length);
	}
}

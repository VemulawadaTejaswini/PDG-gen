import java.util.Scanner;

class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		double r = sc.nextDouble();
		double area = Math.PI*r*r;
		double length = Math.PI*r*2;
		System.out.printf("%f %f%n",area,length);
	}
}

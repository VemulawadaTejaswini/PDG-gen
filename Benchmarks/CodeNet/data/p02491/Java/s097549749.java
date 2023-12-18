import java.util.Scanner;

class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		double c = a;
		double d = b;
		int syo;
		int amr;
		double ten;
		syo = a / b;
		amr = a % b;
		ten = c / d;
		System.out.println(syo + " " + amr + " " + ten);
	}
}
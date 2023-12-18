import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double w = sc.nextDouble(),h = sc.nextDouble();
		double x = sc.nextDouble(),y = sc.nextDouble();
		if(x == w / 2 && y == h / 2) {
			System.out.print((w*h)/2+" ");
			System.out.println(1);
		}else {
			System.out.print((w*h)/2+" ");
			System.out.println(0);
		}
	}
	
}
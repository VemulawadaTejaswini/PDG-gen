import java.util.Scanner;

public class Main{
	public static void main(String[]args) {
		Scanner sc =new Scanner(System.in);
		while(sc.hasNext()) {
		double v = sc.nextDouble();
		double y= 4.9*(v/9.8)*(v/9.8);
		double ans=(y+5.0)/5.0;
		System.out.println((int)Math.ceil(ans));
		}
	}

}

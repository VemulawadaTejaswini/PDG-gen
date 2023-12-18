import java.util.Scanner;
public class Main {
	public static void main(String[] args)  {
		Scanner sc = new Scanner(System.in);
		double r = sc.nextInt();
		System.out.printf("%.5f %.5f\n",r*r*3.1415926,r*3.1415926*2);
	}
}
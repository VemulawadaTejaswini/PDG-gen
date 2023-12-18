import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
			int a=scan.nextInt();
			double x,y;
			x=a*a*3.141592653589;
			y=(a+a)*3.141592653589;
			System.out.println(String.format("%.6f %.6f",x,y));
		scan.close();
}
}

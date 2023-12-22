import java.util.Scanner;

public class Main {


	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double W = sc.nextDouble();
		double H = sc.nextDouble();
		double x = sc.nextDouble();
		double y = sc.nextDouble();
		sc.close();



		double ans1 = (W*H)/2;

		if(W/2 == x && H/2 == y){
			System.out.println(ans1 + " " + 1);
		}
		else{
			System.out.println(ans1 + " " + 0);

		}
	}
}

import java.util.Scanner;

public class Main {
	public static void main(String args[]){
		Scanner in = new Scanner(System.in);
		while(true){
			int x = in.nextInt();
			int h = in.nextInt();
			if(x + h == 0)break;
			double x2 = x;
			double h2 = h;
			double S = x2*x2 +2*x2*Math.sqrt((x2*x2)/4+h2*h2);
			System.out.println(S);
		}
	}
}
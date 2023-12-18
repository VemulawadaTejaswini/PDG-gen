import java.util.Scanner;

public class aoj0218 {
	public static void main(String args[]){
		Scanner in = new Scanner(System.in);
		while(true){
			int x = in.nextInt();
			int h = in.nextInt();
			if(x + h == 0)break;
			double S = x*x+2*x*Math.sqrt((x/2)*(x/2)+h*h);
			System.out.println(S);
		}
	}
}
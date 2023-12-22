import java.util.Random;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		Random rand=new Random();
		double a=scan.nextInt();
		double b=scan.nextInt();
		int c=scan.nextInt();
		int d=scan.nextInt();
		double ansa=a*b/2;//対角線を通れば二分の一になるため(soutomokagiran)
		int ansb=0;
		if(c==a/2&&d==b/2) {
			ansb=1;
		}
		System.out.println(ansa+" "+ansb);
	}
}

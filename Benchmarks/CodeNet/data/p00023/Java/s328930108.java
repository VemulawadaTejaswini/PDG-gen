
import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		int n = stdIn.nextInt();
		for(int i=0;i<n;i++){
			double xa = stdIn.nextDouble();
			double ya = stdIn.nextDouble();
			double ra = stdIn.nextDouble();
			double xb = stdIn.nextDouble();
			double yb = stdIn.nextDouble();
			double rb = stdIn.nextDouble();
			
			double distance = Math.sqrt(Math.pow(xa-xb,2)+Math.pow(ya-yb,2));
			
			if((ra+rb)<distance){
				System.out.println(0);
			}
			else if(Math.min(ra,rb)<=distance){
				System.out.println(1);
			}
			else if(ra<rb){
				System.out.println(-2);
			}
			else{
				System.out.println(2);
			}
		}
	}
}
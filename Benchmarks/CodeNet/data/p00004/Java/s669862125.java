import java.util.Scanner;
import java.math.BigDecimal;
import java.text.*;

public class Main{
	public static void main(String args[]){
	new Main().run();
	}
	
	Scanner in = new Scanner(System.in);
	void run(){
	int a,b,c,d,e,f;
	double x,y;
	
		while(in.hasNextInt()){
		a = in.nextInt();
		b = in.nextInt();
		c = in.nextInt();
		d = in.nextInt();
		e = in.nextInt();
		f = in.nextInt();
		
		y = (d*c-a*f) /(d*b-a*e);
		x = (c*e-b*f)/(e*a-b*d);
		
		
		BigDecimal bd1 = new BigDecimal(x);
		BigDecimal bd2 = new BigDecimal(y);
		BigDecimal x1 = bd1.setScale(3, BigDecimal.ROUND_HALF_UP);
		BigDecimal y1 = bd2.setScale(3, BigDecimal.ROUND_HALF_UP);

		}
		}
		}

import java.util.*;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner stdIn = new Scanner(System.in);
		
		while(stdIn.hasNext()){
			double a,b,c,d,e,f;
			a = stdIn.nextDouble();
			b = stdIn.nextDouble();
			c = stdIn.nextDouble();
			d = stdIn.nextDouble();
			e = stdIn.nextDouble();
			f = stdIn.nextDouble();
			
			double det = a*e-b*d;
			
			double x = (c*e-b*f)/det;
			double y = (a*f-c*d)/det;
			
			if(x==-0)
				x = 0;
			if(y==-0)
				y = 0;
			
			System.out.printf("%.3f %.3f\n",x,y);
			
			
		}

	}


}
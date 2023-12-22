import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan=new Scanner(new BufferedReader(new InputStreamReader(System.in)));
		float a,b,c,d,e,f;
		try {
			while(scan.hasNext()){
				a=scan.nextFloat();
				b=scan.nextFloat();
				c=scan.nextFloat();
				d=scan.nextFloat();
				e=scan.nextFloat();
				f=scan.nextFloat();
				float y=((a*f)-(c*d))/(float)((a*e)-(b*d));
				float x=(c-(b*y))/(float)a;
				System.out.printf("%.3f %.3f\n",x,y);
			}
		} catch (Exception e2) {
		}
	}

}
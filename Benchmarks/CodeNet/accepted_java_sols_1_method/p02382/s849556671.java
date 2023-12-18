import java.awt.Point;
import java.util.Arrays;
import java.util.Scanner;

public class Main{
	
	static final Scanner s=new Scanner(System.in);
	
	public static void main(String args[]){
		int n=s.nextInt();
		Point in[]=new Point[n];
		for(int i=0; i<n; i++)
			in[i]=new Point(s.nextInt(),0);
		for(int i=0; i<n; i++)
			in[i].translate(0,s.nextInt());
		
		for(int i=1; i<=3; i++){
			final int b=i;
			System.out.println(
					Math.pow(
							Arrays.stream(in)
									.mapToDouble(p->Math.pow(Math.abs(p.x-p.y),b))
									.sum(),
							1.0/b));
		}
		System.out.println(
				Arrays.stream(in)
						.mapToInt(p->Math.abs(p.x-p.y))
						.max().getAsInt());
	}
}
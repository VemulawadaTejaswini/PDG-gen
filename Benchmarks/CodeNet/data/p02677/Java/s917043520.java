import java.io.*;
import java.math.*;
import java.util.*;
public class Main { 
	public static void main(String[] args) { 
		Scanner input = new Scanner(System.in);
		double HourLength = input.nextDouble();
		double MinLength = input.nextDouble();
		double H = input.nextDouble();
		double M = input.nextDouble();
		double Htheta = (H/12)*360.0;
		double Mtheta = (M/60)*360.0;
		Htheta+=30.0*(Mtheta/360.0);
		double ans = HourLength*HourLength+MinLength*MinLength;
		double TotalAngle = Math.abs(Htheta-Mtheta);
		double cos = Math.cos(Math.toRadians(TotalAngle));
		ans-=2*HourLength*MinLength*cos;
		//System.out.println(cos);
		System.out.println(Math.sqrt(ans));
	}
}

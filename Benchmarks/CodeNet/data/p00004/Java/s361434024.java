import java.util.*;
import java.lang.*;

class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
    	Scanner in = new Scanner(System.in);
		
		while(in.hasNext()) {
			// ax + by = c
			double a = in.nextDouble();
			double b = in.nextDouble();
			double c = in.nextDouble();
			// dx + ey = f
			double d = in.nextDouble();
			double e = in.nextDouble();
			double f = in.nextDouble();
			
			// x = (c - by) / a &#227;&#129;¨&#227;&#129;&#153;&#227;&#130;&#139;&#227;&#129;¨&#227;&#128;&#129;
			// d(c/a - by/a) + ey = f &#227;&#129;&#171;&#227;&#129;&#170;&#227;&#130;&#139;&#227;&#128;&#130;&#227;&#129;&#147;&#227;&#130;&#140;&#227;&#130;&#146;&#227;&#130;&#130;&#227;&#129;¨&#227;&#129;&#171;&#227;&#128;&#129;y&#227;&#130;&#146;&#230;±&#130;&#227;&#130;&#129;&#227;&#130;&#139;&#227;&#128;&#130;
			double y = (f + (-1 * d * (c / a))) / ((-1 * (d / a) * b) + e);
			// &#230;±&#130;&#227;&#130;&#129;&#227;&#129;&#159;y&#227;&#130;&#146;&#227;&#130;&#130;&#227;&#129;¨&#227;&#129;&#171;&#227;&#128;&#129;x&#227;&#130;&#146;&#230;±&#130;&#227;&#130;&#129;&#227;&#130;&#139;&#227;&#128;&#130;
			double x = (f + (-1 * e * y)) / d;
			
			System.out.println(x + " " + y);
		}		
	}
}
import java.io.*;
import java.awt.geom.Point2D;

public class Main{
	public static void main(String args[]) throws IOException{
		double p[] = new double[4];
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String[] str = br.readLine().split(" ");
		for(int i = 0; i < 4; i++)
			p[i] = Double.parseDouble(str[i]);
		
		System.out.println(Point2D.distance(p[0], p[1], p[2], p[3]));
	}
}
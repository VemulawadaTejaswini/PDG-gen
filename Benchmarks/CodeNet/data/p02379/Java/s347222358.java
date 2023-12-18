import java.io.*;
import java.awt.geom.Point2D;

public class Main{
	public static void main(String args[]) throws IOException{
		float p[] = new float[4];
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String[] str = br.readLine().split(" ");
		for(int i = 0; i < 4; i++)
			p[i] = Float.parseFloat(str[i]);
		
		System.out.println((float)Point2D.distance(p[0], p[1], p[2], p[3]));
	}
}
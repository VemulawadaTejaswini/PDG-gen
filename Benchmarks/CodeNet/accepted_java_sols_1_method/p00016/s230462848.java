import java.math.*;
import java.text.*;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		in.useDelimiter("\\s*[,\\n]\\s*");
		double cx = 0, cy = 0, ct=Math.toRadians(90);
		while(in.hasNextInt()){
			int r = in.nextInt();
			cx += r*Math.cos(ct);
			cy += r*Math.sin(ct);
			int t = in.nextInt();
			ct -= Math.toRadians(t);
			if(r==0 && t==0) break;
		}
		System.out.println((int)cx);
		System.out.println((int)cy);
	}

}
import java.util.*;
import java.math.*;
public class Main {
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		float r = in.nextFloat();
		float s = r*r*(float)Math.PI;
		float l = r*2*(float)Math.PI;
		System.out.println(s+" "+l);
	}
}
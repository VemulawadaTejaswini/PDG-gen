import java.util.*;
class Main{
	static Scanner s = new Scanner(System.in);
	public static void main(String[] args) {
		double r = Double.parseDouble(s.next());
		System.out.printf("%f %f \n",Math.PI*r*r,Math.PI*r*2);
	}
}
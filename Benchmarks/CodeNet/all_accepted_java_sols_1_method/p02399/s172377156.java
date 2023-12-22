import java.util.*;

class Main{
	public static void main(String[]args){
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		int b = s.nextInt();
		double d, r, f;{
			d = a / b;
			r = a % b;
			f = (double) a / b;
		}

		System.out.println(String.format("%.0f", d) + " " + String.format("%.0f", r) + " " + String.format("%.5f", f));
	}
}

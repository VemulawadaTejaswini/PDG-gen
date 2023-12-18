import java.util.*;

public class Main {
	public static void main(String[] args){
		Scanner n = new Scanner(System.in);
		int a,b,d,r;
		double f;
		a = n.nextInt();
		b = n.nextInt();
		
		d = a/b;
		r = a%b;
		f = (double)a/(double)b;
		
		System.out.println(d + " " + r + " " + (double)f);
	}
}
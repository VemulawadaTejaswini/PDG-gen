
import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		int r;
		double ce,cf;
		Scanner sc = new Scanner(System.in);
		//String s = br.readLine();
		//r = Double.parseDouble(s);
		r = sc.nextInt();
		ce = r*r*3.141592;
		//円の面積
		cf = 2*r*3.141592;
		//円周
		//System.out.printf("%.6f %.6f",ce,cf);
		System.out.println(ce+" "+cf);
	}
}
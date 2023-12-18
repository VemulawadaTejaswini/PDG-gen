import java.text.DecimalFormat;
import java.util.Scanner;


public class Main {
	public static void main(String[] args){
		Scanner scanner=new Scanner(System.in);
		double r=scanner.nextDouble();
		DecimalFormat exObject1 = new DecimalFormat("#.0000000000"); 
		System.out.println(exObject1.format(r*r*Math.PI)+" "+exObject1.format(r*2*Math.PI));
	}
}
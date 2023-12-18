import java.text.NumberFormat;
import java.util.Scanner;


public class Main {
	public static void main(String[] args){
		Scanner scanner=new Scanner(System.in);
		double r=scanner.nextDouble();
		System.out.println((double)Math.round(r*r*Math.PI*10000000)/10000000+" "+(double)Math.round(r*2*Math.PI*10000000)/10000000);
	}
}
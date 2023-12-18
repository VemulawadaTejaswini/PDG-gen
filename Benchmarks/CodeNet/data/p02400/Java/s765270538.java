import java.util.*;
public class Main {
	public static void main(String[] args) throws Exception{
		Scanner sc = new Scanner(System.in);
		final double pie =  3.1415926535;
		Double d = sc.nextDouble();
		System.out.println(String.format("%.6f",d*d*pie)+" "+String.format("%.6f",2*d*pie));
	}
}
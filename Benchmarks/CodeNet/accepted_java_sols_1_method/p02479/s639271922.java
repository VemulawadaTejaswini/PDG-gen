import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan=new Scanner(new BufferedReader(new InputStreamReader(System.in)));
		while(scan.hasNext()){
			double r=scan.nextDouble();
			System.out.printf("%.6f %.6f",(Math.PI*r*r),(2*Math.PI*r));
		}
	}
}
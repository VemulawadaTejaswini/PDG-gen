import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		Scanner scan=new Scanner(new BufferedReader(new InputStreamReader(System.in)));
		double x1=scan.nextDouble();
		double y1=scan.nextDouble();
		double x2=scan.nextDouble();
		double y2=scan.nextDouble();
		
		System.out.printf("%.8f",Math.sqrt(((x2-x1)*(x2-x1))+((y2-y1)*(y2-y1))));
		System.out.println();
	}

}
import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		
	Scanner sc = new Scanner(System.in);
	
	double r = sc.nextInt();
	
	
	System.out.printf("%.6f %.6f\n" ,r * r * Math.PI,(r*2) * Math.PI);
	sc.close();
	}
}

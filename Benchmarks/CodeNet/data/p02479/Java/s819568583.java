import java.util.Scanner;

public class Main {
	public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	double pi = Math.PI;
	int r = sc.nextInt();
	double area = (2*r*pi);
	double length = ( pi*r*r);
	System.out.printf("%.6f" + " "+"%.6f",area,length);
	}
}
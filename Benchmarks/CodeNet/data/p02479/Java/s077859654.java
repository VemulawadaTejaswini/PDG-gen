import java.util.Scanner;

public class Main{
	public static void main(String args[]){
	Scanner sc = new Scanner(System.in);
	double r = sc.nextDouble();
	int area = Math.PI * r * r;
	int length = 2 * Math.PI * r;
	System.out.println(area + " " + length);
	}
}
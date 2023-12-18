import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner sc =new Scanner(System.in);
		double pi = Math.PI;

		int r = sc.nextInt();
		double length =(r*2)*pi;
		double area =r*r*pi;
		System.out.println(area+" "+length);
	}	
}
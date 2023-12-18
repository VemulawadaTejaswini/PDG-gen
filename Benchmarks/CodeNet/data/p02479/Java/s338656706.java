import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);			
		sc.useDelimiter("\\s"); 
		int x=sc.nextInt();
		double r=3.14159275;
		double S=(double)x*(double)x*r;
		double R=(double)x*2*r;
		System.out.printf("%.5f %.5f\n",S,R);
	}
	

}
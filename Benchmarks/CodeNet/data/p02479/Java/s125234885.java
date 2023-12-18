import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);			
		sc.useDelimiter("\\s"); 
		int x=sc.nextInt();
		double S=(double)x*(double)x*3.141592653589;
		double R=(double)x*2.0*3.141592653589;
		System.out.printf("%.6f %.6f\n",S,R);
	}
}
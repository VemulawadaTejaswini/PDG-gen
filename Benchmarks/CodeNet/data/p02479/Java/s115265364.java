import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);			
		sc.useDelimiter("\\s"); 
		int x=sc.nextInt();
		float S=(float) ((float)x*(float)x*3.141592653589);
		float R=(float) ((float)x*2.0*3.141592653589);
		System.out.printf("%.5f %.5f\n",S,R);
	}
	

}
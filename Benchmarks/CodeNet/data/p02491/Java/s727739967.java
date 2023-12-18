import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);			
		sc.useDelimiter("\\s"); 
		int x=sc.nextInt();
		int y=sc.nextInt();
		int d=x/y;
		int r=x%y;
		double f=(double)x/(double)y;
		System.out.printf("%d %d %.5f\n",d,r,f);
	}
	

}
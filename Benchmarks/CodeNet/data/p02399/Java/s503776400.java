import java.util.Scanner;

public class Main {	
	public static void main(String[]args){
		Scanner scan =new Scanner(System.in);
			int a =scan.nextInt();
			int b =scan.nextInt();
			
			int c =a/b;
			int d =a%b;
			double e =(double)a/(double)b;
			
			System.out.println(c+" "+d+" "+e);				
			}
	}
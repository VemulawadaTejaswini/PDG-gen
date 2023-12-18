import java.util.Scanner;

public class Main{
	
	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		
		long A=scn.nextLong();
		long B=scn.nextLong();
			
		if((A+B)%2==0) {
			long s=(A+B)/2;
			
			System.out.println(s);
			
		}
		else {
			System.out.println("IMPOSSIBLE");
		}
			
		scn.close();	
	}
	
}
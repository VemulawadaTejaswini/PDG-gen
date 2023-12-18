
import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner ob=new Scanner(System.in);
		double d=ob.nextInt();
		double t=ob.nextInt();
		double s=ob.nextInt();
		if((d*(1.0)/s)<=t){System.out.println("Yes");}
		else {System.out.println("No");}
	}
}
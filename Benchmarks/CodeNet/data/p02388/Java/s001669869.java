import java.util.Scanner;
import java.lang.Math;

public class Main{
  public static void main(String[] args){
  	Scanner stdn = new Scanner(System.in);
	double x = 0;

	  	System.out.print("x=");
	  		x = stdn.nextInt();
	  	if(x > 0 && x < 101){
	  		x = Math.pow(x,3.0);
	  	}
	    System.out.println((int)x);
  }
}
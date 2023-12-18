import java.util.Scanner;
import java.lang.Math;

public class Main{
  public static void main(String[] args){
  	
  	//Optional : To state what to input (Comment ouot if needed)
	//System.out.println("Please input a number within 1 ~ 100");
  	
  	Scanner stdn = new Scanner(System.in);
  	
  	//Initialization interger 
	int x = 0;
  	double y = 0;
 		x = stdn.nextInt();
	  	if(x > 0 && x < 101){
	  		y = Math.pow((double)x,3d);
	  		x = (int)y;
	  	}
	    System.out.println(x);
  }
}
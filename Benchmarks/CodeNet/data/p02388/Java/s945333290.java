import java.util.Scanner;
import java.lang.Math;

public class Main{
	public static void main (String[] args){
		Scanner standard = new Scanner(System.in);
		
		//Optional : To state what to input (Comment out if needed)
		//System.out.println("Please input a number within 1 ~ 100");
		
		
		//Initialization interger x 
		int x = 0;
		int y = 0;
		x = standard.nextInt();
		if(x > 0 && x < 101){
			y = x*x*x;
		}
		
		//Print out the result of cubic square based on input
		System.out.print(y);
		
	
	
	
	}



}
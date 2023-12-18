import java.io.BufferedInputStream;
import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner stdin = new Scanner(new BufferedInputStream(System.in));
		  int size=Integer.parseInt(stdin.nextLine());
		   int[] reversedArray = new int[size];
	      String input = stdin.nextLine();
		  String[] inputs = input.split(" "); 
		  int[] numbers = new int[inputs.length];		  
		  for(int i = 0;i < inputs.length;i++)
		  {
		    numbers[i] = Integer.parseInt(inputs[i]);
		  }
		  for (int i=0; i<numbers.length; i++) {
			  reversedArray[i] = numbers[numbers.length - 1 - i];	
			   System.out.print(reversedArray[i]);
			   System.out.print(" ");
		    }       
	  
	   }		
	}
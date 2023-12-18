import java.util.Scanner;

public class Main{
	public static void main (String[] args){
		Scanner standard = new Scanner(System.in);
		
		int [] integers; 
		
//		System.out.print("How many integers do you want to type:");
		int size = standard.nextInt();
		integers = new int[size];
		
		for(int i = 0; i < size; i++){
//			System.out.print("Input in "+(i+1)+ " integers:");
			integers[i] = standard.nextInt();
			
		}
		
		System.out.println();
//		System.out.println("Given integers in reverse order:");
		
		for(int i = size-1; i >= 0; i--){
			System.out.print(integers[i] + " ");
		}
	
	}
}
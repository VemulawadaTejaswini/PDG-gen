
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		int[] input = new int[10];
		Scanner s = new Scanner(System.in);
		for(int i=0; i<10; i++){
			//System.out.println("Please input the "+ (i+1) +"th number(integer)");
			input[i]=s.nextInt();
		}
		
		Arrays.sort(input);
		int i=input.length-1;
		while(i>input.length-4){
			System.out.println(input[i]);
			i--;
		}			
	}
}
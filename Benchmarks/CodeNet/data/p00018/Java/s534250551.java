import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;


public class Main {

	public static void main(String[] a){
		
		int inputCount = 5;
		
		Scanner in = new Scanner(System.in);
		String input = in.nextLine();
		String[] numArray = input.split(" ");
		
		if (numArray.length == inputCount){
			ArrayList <Integer> output = new ArrayList<Integer>();
			for (String s : numArray){
				//convert to ArrayList<Integer>
				output.add(Integer.parseInt(s)); // to check if a number
			}
			
			Collections.sort(output);
			String outputSeq = "";
			for (Integer i: output){
				outputSeq = i + " " + outputSeq;
			}
			
			System.out.println(outputSeq);
		} else {
		}
		
	}
}
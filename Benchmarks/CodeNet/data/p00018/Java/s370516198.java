import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;


public class Main {

	public static void main(String[] a){
		
		int inputCount = 5;
		
		Scanner in = new Scanner(System.in);
		String inputSeq = in.nextLine();
		String[] numArray = inputSeq.split(" ");
		
		if (numArray.length == inputCount){
			ArrayList <Integer> outputList = new ArrayList<Integer>();
			for (String s : numArray){
				//convert to ArrayList<Integer>
				outputList.add(Integer.parseInt(s)); // to check if a number
			}
			
			Collections.sort(outputList);
			String outputSeq = "";
			for (Integer i: outputList){
				outputSeq = i + " " + outputSeq;
			}
			
			System.out.println(outputSeq);
		} else {
		}
		
	}
}
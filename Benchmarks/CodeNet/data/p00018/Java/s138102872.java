import java.util.ArrayList;
import java.util.Scanner;


class Main {

	public static void main(String[] a){
		
		int inputCount = 5;
		
		Scanner in = new Scanner(System.in);
		String inputSeq = in.nextLine();
		String[] numArray = inputSeq.split(" ");
		
		if (numArray.length == inputCount){
			ArrayList <Integer> outputList = new ArrayList<Integer>();
			for (String s : numArray){
				outputList.add(Integer.parseInt(s)); // to check if a number
			}

			String outputSeq = "";
			
			Integer prev = null;
			for (Integer i: outputList){
				if (prev == null){
					prev = i;
					outputSeq = i + " ";
				} else if (i >= prev){
					outputSeq = i + " "+ outputSeq;
				} else {
					outputSeq = outputSeq + " " + i;
				}
			}
			System.out.println(outputSeq);
		} else {
		}
		
	}
}
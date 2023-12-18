import java.util.Arrays;
import java.util.Scanner;


public class Main {

	public static void main(String[] a){
		
		int inputCount = 5;
		
		Scanner in = new Scanner(System.in);
		String input = in.nextLine();
		String[] numArray = input.split(" ");
		
		if (numArray.length == inputCount){
			try{
				int[] temp = new int [inputCount];
				for (int i=0; i<inputCount; i++){
					temp[i] = Integer.parseInt(numArray[i]);
				}
				//Arrays.sort(temp, Collections.reverseOrder());
				Arrays.sort(temp);
				
				int[] outputSeq = new int [inputCount];
				int j=0;
				for (int i=(inputCount-1); i>-1; i--){
					outputSeq[j] = temp[i];
					j++;
				}
				
				for (int i: outputSeq){
					System.out.print(i + " ");
				}
			} catch (NumberFormatException e){
			}
		}
		
	}
}
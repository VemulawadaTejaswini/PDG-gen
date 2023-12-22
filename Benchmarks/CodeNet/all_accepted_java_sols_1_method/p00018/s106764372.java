import java.util.Arrays;
import java.util.Scanner;


class Main {

	public static void main(String[] a){
		
		int inputCount = 5;
		
		Scanner in = new Scanner(System.in);
		String input = in.nextLine();
		String[] numArray = input.split(" ");
		
		
		int[] temp = new int [inputCount];
		for (int i=0; i<inputCount; i++){
			temp[i] = Integer.parseInt(numArray[i]);
		}

		Arrays.sort(temp);
		
		/*for (int i=(inputCount-1); i>-1; i--){
			System.out.print(temp[i]);
			if (i != 0){
				System.out.print(" ");
			}
		}*/
		
		System.out.println(temp[4] + " " +
						   temp[3] + " " +
						   temp[2] + " " +
						   temp[1] + " " +
						   temp[0]);
	}
}
import java.util.Arrays;
import java.util.Scanner;


public class Main{
	public static void main(String args[]){
		Scanner stdIn = new Scanner(System.in);
		int[] intArray = new int[5];
		for(int i = 0;i < intArray.length; i++){
			intArray[i] = stdIn.nextInt();
		}
		Arrays.sort(intArray);
		for(int i = 0;i < intArray.length; i++){
			if(i == intArray.length - 1){
				System.out.println(intArray[i]);
			}else{
				System.out.print(intArray[i] + " ");
			}
		}
	}
}

import java.util.Arrays;
import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		int[] data = new int[10];
		for(int i=0;i<10;i++){
			data[i] = stdIn.nextInt();
		}
		
		Arrays.sort(data);
		
		for(int i=data.length-1;i>=data.length-3;i--){
			System.out.println(data[i]);
		}
	}
}
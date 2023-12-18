import java.util.Scanner;
public class Main {
	
	public static void main(String arg[]){
		Scanner in = new Scanner(System.in);
		
		int n = in.nextInt();
		int[] input = new int[n];
		
		for(int i=0; i < n; i++){
			input[i] = in.nextInt();
		}	
		
		for(int i=0; i < input.length; i++){
			System.out.print(input[i] + " ");
		}
		System.out.println();
		
		for(int i=1; i < input.length; i++){
			int key = input[i];
			int j = i-1;
			while(j >=0 && input[j] > key){
				input[j+1] = input[j];
				j--;
			}
			input[j+1] = key;
			for(int k=0; k < input.length; k++){
				System.out.print(input[k] + " ");
			}
			System.out.println();
		}
	}
}
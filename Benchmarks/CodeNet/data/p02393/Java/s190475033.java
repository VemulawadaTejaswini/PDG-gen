import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner kbScanner = new Scanner(System.in);
		
		int[] input = new int[3];
		for(int i = 0; i < input.length; i++){
			input[i] = kbScanner.nextInt();
		}
		
		int[] output = input.clone();
		int p = 0;//???????????? 
		for(p = 0; p < output.length - 1; p++){
			for(int i = p; i < output.length - 1; i++){
				if(output[p] > output[i + 1]){
					int oki = output[p];
					output[p] = output[i + 1];
					output[i + 1] = oki;
				}
			}
		}
		
		System.out.println(output[0] + " " + output[1] + " " + output[2]);
	}
}
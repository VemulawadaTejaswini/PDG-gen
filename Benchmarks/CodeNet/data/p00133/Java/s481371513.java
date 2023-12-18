import java.util.Scanner;

public class Main {
	
	
	public static final int SIZE = 8;
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		char[][] input = new char[SIZE][SIZE];
		char[][] output = new char[SIZE][SIZE];
		for(int i = 0; i < SIZE; i++){
			input[i] = sc.nextLine().toCharArray();
		}
		
		for(int i = 0; i < 3; i++){
			System.out.println((i+1)*90);
			for(int j = 0; j < SIZE; j++){
				for(int k = 0; k < SIZE; k++){
					output[k][(SIZE - 1) - j] = input[j][k];
				}	
			}
			
			for(int j = 0; j < SIZE; j++){
				for(int k = 0; k < SIZE; k++){
					System.out.print(output[j][k]);
				}
				System.out.println();
			}
			
			char[][] tmp = input;
			input = output;
			output = tmp;
		}
	}
	
}
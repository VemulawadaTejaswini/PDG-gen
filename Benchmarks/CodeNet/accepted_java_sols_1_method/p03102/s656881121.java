import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int numN = in.nextInt();
		int numM = in.nextInt();
		int numC = in.nextInt();

		int[] arrayB = new int[numM];
		
		for(int i = 0; i< numM; i++){
			arrayB[i] = in.nextInt();
		}
		

		int result = 0;
		int numForcheck = 0;
		for(int k = 0; k < numN ; k++ ){
			
			for(int j = 0; j< numM; j++){
				numForcheck += in.nextInt() * arrayB[j];
			}
			
			if(numForcheck + numC > 0){
				result ++;
			}
			numForcheck = 0;
		}
		System.out.println(result);
		
		in.close();
	}

}
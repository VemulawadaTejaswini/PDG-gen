import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int line = scan.nextInt();
		
		int[][] output = new int[line][line];

		for(int i = 0; i < line; i++){
			int vartex = scan.nextInt();
			int edge = scan.nextInt();
			
			for(int j = 0; j < edge; j++){
				int conVartex = scan.nextInt();
				output[vartex-1][conVartex-1] = 1;
			}
		}

		for(int i = 0; i < output.length; i++){
			for(int j = 0; j < output[i].length; j++){
				System.out.print(output[i][j]);
				System.out.print(" ");
			}
			System.out.println();
		}
		scan.close();
	}

}
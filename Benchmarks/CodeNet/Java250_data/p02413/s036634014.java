import java.io.*;
import java.util.*;

public class Main {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] input = br.readLine().split(" ");
		Integer height = Integer.parseInt(input[0]);
		Integer width = Integer.parseInt(input[1]);
		Integer[][] board = new Integer[height][width+1];

		for(int i = 0; i < height; i++){
			String line = br.readLine();
			System.out.print(line + " ");
			String[] numbers = line.split(" ");
			Integer total = 0;
			for(int j = 0; j < width; j++){
				Integer num = Integer.parseInt(numbers[j]);
				total += num;
				board[i][j] = num;
			}
			board[i][width] = total;
			System.out.print(total + "\n");
		}
		for(int i = 0; i <= width; i++){
			Integer result = 0;
			for(int j = 0; j < height; j++){
				result += board[j][i];
			}
			if(i == width){
				System.out.print(result + "\n");
			}
			else{
				System.out.print(result + " ");
			}
		}
	}
}
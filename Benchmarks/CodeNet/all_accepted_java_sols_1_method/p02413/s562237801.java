import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main (String[] args) throws java.lang.Exception
	{
		BufferedReader input = new BufferedReader (new InputStreamReader (System.in));
		
		String[] matrixStr = input.readLine().split(" ");
		
		int row = Integer.parseInt(matrixStr[0]);
		
		int column = Integer.parseInt(matrixStr[1]);
		
		int[][] spreadsheet = new int[row + 1][column +1];
		
		for(int rowNum = 0; rowNum < row; rowNum++)
		{
			String[] rowStr = input.readLine().split(" ");
			
			int rowSum = 0;
			
			for(int columnNum = 0; columnNum < column; columnNum++)
			{
				spreadsheet[rowNum][columnNum] = Integer.parseInt(rowStr[columnNum]);
				
				rowSum = rowSum + spreadsheet[rowNum][columnNum];
			}
			
			spreadsheet[rowNum][column] = rowSum;
		}
		
		for(int columnNum = 0; columnNum <= column; columnNum++)
		{
			int columnSum = 0;
			
			for(int rowNum = 0; rowNum < row; rowNum++)
			{
				columnSum = columnSum + spreadsheet[rowNum][columnNum];
			}
			
			spreadsheet[row][columnNum] = columnSum;
		}
		
		for(int rowNum = 0; rowNum <= row; rowNum++)
		{
			for(int columnNum = 0; columnNum <= column; columnNum++)
			{
				System.out.print(spreadsheet[rowNum][columnNum]);
				
				if(columnNum != column)
				{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}


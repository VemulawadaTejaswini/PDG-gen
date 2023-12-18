import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main (String[] args) throws java.lang.Exception
	{
		BufferedReader input = new BufferedReader (new InputStreamReader (System.in));
		
		String[] matrixStr = input.readLine().split(" ");
		
		int row = Integer.parseInt(matrixStr[0]);
		
		int rowCol = Integer.parseInt(matrixStr[1]);
		
		int column = Integer.parseInt(matrixStr[2]);
		
		int[][] matrixA = new int[row][rowCol];
		
		int[][] matrixB = new int[rowCol][column];
		
		long[][] matrixC = new long [row][column];
		
		//行列Aの作成
		for(int rowNum = 0; rowNum < row; rowNum++)
		{
			String[] rowStr = input.readLine().split(" ");
			
			for(int rowColNum = 0; rowColNum < rowCol; rowColNum++)
			{
				matrixA[rowNum][rowColNum] = Integer.parseInt(rowStr[rowColNum]);
			}
		}
		
		//行列Bの作成
		for(int rowColNum = 0; rowColNum < rowCol; rowColNum++)
		{
			String[] rowStr = input.readLine().split(" ");
			
			for(int columnNum = 0; columnNum < column; columnNum++)
			{
				matrixB[rowColNum][columnNum] = Integer.parseInt(rowStr[columnNum]);
			}
		}
		
		//行列Cの作成
		for(int rowNum = 0; rowNum < row; rowNum++)
		{
			for(int columnNum = 0; columnNum < column; columnNum++)
			{
				long sum = 0;
				
				for(int rowColNum = 0; rowColNum < rowCol; rowColNum++)
				{
					sum = sum + matrixA[rowNum][rowColNum] * matrixB[rowColNum][columnNum];
				}
				
				matrixC[rowNum][columnNum] = sum;
			}
		}
		
		//行列Cの表示
		for(int rowNum = 0; rowNum < row; rowNum++)
		{
			for(int columnNum = 0; columnNum < column; columnNum++)
			{
				System.out.print(matrixC[rowNum][columnNum]);
				if(columnNum != column - 1)
				{
					System.out.print(" ");
				}
			}
			
			System.out.println();
		}
	}
}


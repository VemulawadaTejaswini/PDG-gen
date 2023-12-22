
import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args)
	{
		Scanner stdIn = new Scanner(System.in);
		int r = stdIn.nextInt();
		int c = stdIn.nextInt();
		int[][] number = new int[r][c];
		int[] count_x = new int[r];
		int[] count_y = new int[c];
		int count = 0;
		
		Arrays.fill(count_x,0);
		Arrays.fill(count_y,0);
		
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
				number[i][j] = stdIn.nextInt();
				count_x[i]+=number[i][j];
				count_y[j]+=number[i][j];
				count += number[i][j];
			}
		}
		
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
				System.out.print(number[i][j]+" ");
			}
			System.out.println(count_x[i]);
		}
		
		for(int i=0;i<c;i++)
		{
			System.out.print(count_y[i]+" ");
		}
		
		System.out.println(count);
		
	}
}
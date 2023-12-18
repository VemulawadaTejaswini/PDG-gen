import java.util.Scanner;
import java.util.Arrays;

public class aoj0001
{
	public static void main(String[] args)
	{
		Scanner cin = new Scanner(System.in);
		
		int data[] = new int[10];
		for(int i=0; i<10; i++)
		{
			data[i] = cin.nextInt();
		}
		Arrays.sort(data);
		
		for(int i=1; i<=3; i++)
		{
			System.out.println(data[data.length-i]);
		}
	}
}
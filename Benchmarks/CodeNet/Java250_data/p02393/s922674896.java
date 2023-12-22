import java.util.Scanner;

public class Main {
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		int[] array = new int[3];
		int box = 0;
		for(int i = 0;i < 3;i++)
		{
			array[i] = scan.nextInt();
		}
		
		for(int i = 0;i < 2;i++)
		{
			for(int j = i + 1;j < 3;j++)
			{
				if(array[i] > array[j])
				{
					box = array[i];
					array[i] = array[j];
					array[j] = box;
				}
			}
		}
		System.out.println(array[0] + " " + array[1] + " " + array[2]);
	}
}
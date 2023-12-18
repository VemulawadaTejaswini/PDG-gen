import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		while(true)
		{
			int number = sc.nextInt();
			if(number == 0) break;

			int[] values = new int[number];
			int max = -10001;

			for(int i=0 ; i<number ;i++)
			{
				values[i] = sc.nextInt();
			}

			for(int i=0 ; i<number ; i++)
			{
				int sum = 0;
				for(int j=i; j<number ; j++)
				{
					sum += values[j];
					if(max < sum){
						max = sum;
					}
				}
			}

			System.out.println(max);
		}
	}
}
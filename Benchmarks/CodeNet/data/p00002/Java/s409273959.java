import java.util.Scanner;


public class Main {
	public static void main(String[] args) {
		
		int[] num = new int[6];
		int[] ans = new int[3];
		int[] column = {0,0,0};

		Scanner sc = new Scanner(System.in);
		
		for(int i=0; i < 6; i++)
		{
			num[i] = sc.nextInt();
		}
		
		for(int i=0; i < 3; i++)
		{
			ans[i] = num[i*2] + num[i*2+1];
		}
		
		for(int i=0; i < 3; i++)
		{
			while(ans[i] > 0)
			{
			ans[i] = ans[i] / 10;
			column[i]++;
			}
		}
		
		for(int i=0; i < 3; i++)
		{
			System.out.println(column[i]);
		}
	}
}
import java.util.Scanner;

public class Main {
public static void main(String[] args) {

			Scanner sc = new Scanner(System.in);
			int n = sc.nextInt();
			int[] values = new int[n];
			for (int i = 0; i < n; i++)
			{
				values[i] = sc.nextInt();
			}
			int[] costs = new int[n];
			for (int i = 0; i < n; i++)
			{
				costs[i] = sc.nextInt();
			}
			int sum = 0;
			for (int i = 0; i < n; i++)
			{
				if(values[i] >= costs[i])
				{
					int value = values[i] - costs[i];
					sum += value;
				}else
				{
				}
			}
			System.out.println(sum);
		}
	}

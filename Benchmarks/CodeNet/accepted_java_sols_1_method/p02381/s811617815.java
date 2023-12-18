import java.util.Scanner;

public class Main {
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		int count = scan.nextInt();
		double average;
		
		while(count != 0)
		{
			double[] score = new double[count + 1];
			
			for(int i = 0;i < count;i++)
			{
				score[i] = scan.nextDouble();
				score[count] += score[i];
			}
			average = score[count] / count;
			score[count] = 0;
			for(int i = 0;i < count;i++)
			{
				score[i] -= average;
				score[i] = Math.pow(score[i], 2);
				score[count] += score[i];
			}
			score[count] /= count;
			System.out.println(Math.sqrt(score[count]));
			count = scan.nextInt();
		}
	}
}
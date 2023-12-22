import java.util.*;

public final class Main{
	private static int solution(int[] array)
	{
		int current = 1;
		int score = 1;
		int minimum = array[0];
		while(current < array.length)
		{
			if(array[current] < minimum)
			{
				minimum = array[current];
				score++;
			}
			current++;
		}
		return score;
	}
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] array = new int[n];
		for(int i = 0; i < n; i++)
		{
			array[i] = sc.nextInt();
		}
		System.out.println(solution(array));
	}
}
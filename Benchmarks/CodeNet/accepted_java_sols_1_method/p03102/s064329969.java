import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		int C = sc.nextInt();
		int[] b = new int[M];
		int soloutions = 0;
		
		for(int i = 0; i < M; i++)
		{
			b[i] = sc.nextInt();
		}
		
		for(int i = 0; i < N; i++)
		{
			int total = 0;
			for(int j = 0; j < M; j++)
			{
				total = total + b[j] * sc.nextInt(); 
			}
			total = total + C;
			if(total > 0)
			{
				soloutions++;
			}
		}
		
		System.out.println(soloutions);
		
	}
}

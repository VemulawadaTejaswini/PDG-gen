import java.util.*;
public class Main {
	public static void main(String[] args)
	{
		// Input Example:
		//
		// N M
		// K1 A11 A12 ... A1k1
		// K2 A21 A22 ... A2k2
		// .
		// .
		// .
		// KN AN1 AN2 ... ANkN

		Scanner sc = new Scanner(System.in);
		// N people
		int N = sc.nextInt();
		
		// get two integers separated with half-width break
		// M kinds of foods
		int M = sc.nextInt();

		// int A[][] = new int[N][M]; 

		// Ki: the number of foods person i+1 like
		int K;

		// map[M]: the table of the likeness of each foods 
		int map[] = new int[M];

		for (int i=0; i<N; i++)
		{
			K = sc.nextInt();
			for (int j=0; j<K; j++)
			{
				int K_temp;
				K_temp = sc.nextInt();
				map[K_temp-1]++;
			}
		}

		int ans = 0;
		for (int i=0;i<M;i++)
		{
			if (map[i] == N)
			{
				ans++;
			}
		}
		System.out.println(ans);
		
	}

}
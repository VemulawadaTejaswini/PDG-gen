import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

			int n = sc.nextInt();
			int[] S = new int[n];
		for(int i = 0;i < n; i++)
		{
			S[i] = sc.nextInt();
		}

			int q = sc.nextInt();
			int[] T = new int[q];
		for(int i = 0;i < q; i++)
		{
			T[i] = sc.nextInt();
		}
			Arrays.sort(S);
			Arrays.sort(T);
			int count = 0;
		for(int i = 0;i != n;i++)
		{
			if(i>0 && S[i] == S[i-1])continue;
			for(int j = 0;j < q;j++)
			{
				if(S[i] == T[j])
				{
					count++;
					int shorizumi = S[i];
				}
			}
		}
			System.out.println(count);
	}
}
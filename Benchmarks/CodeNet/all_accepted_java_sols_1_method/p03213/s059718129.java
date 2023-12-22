import java.util.Scanner;

public class Main {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		boolean[] sieve = new boolean[101];
		
		sieve[0] = true;
		sieve[1] = true;
		for(int i = 2; i < 101; i++)
		{
			if(!sieve[i])
				for(int j = i*i; j < 101; j+= i)
				{
					sieve[j] = true;
				}
		}
		int ps = 0;
		int[][] inv = new int[n+1][26];
		int[] iden = new int[26];
		
		int[] tot = new int[26];
		
		//dont forget 1 as a divisor!!
		for(int i = 0; i <= n; i++)
		{
			if(!sieve[i])
			{
				int powres = i;
				while(powres <= n)
				{
					for(int j = powres; j <= n; j+=powres)
					{
						inv[j][ps]++;
						tot[ps]++;
					}
					powres *= i;
				}
				iden[ps] = i;
				ps++;
			}
		}
		
		for(int i = 0; i <= n; i++)
		{
			for(int p = 0; p < 26; p++)
			{
//				if(inv[i][p] > 0)
//					System.out.println(i + "'s " + iden[p] + ": " + inv[i][p]);
			}
		}
		for(int p = 0; p < 26; p++)
		{
//			System.out.println("Total " + iden[p] + ": " + tot[p]);
		}
		
		int score = 0;
		for(int i = 0; i < 26; i++)
		{
			//only 1 case
			if(tot[i] >= 74) {score++;}
			if(tot[i] == 0)continue;
			for(int j = i+1; j < 26; j++)
			{
				if(tot[j] == 0)continue;
				//25 * 3, 3 * 25, 15 * 5, 5 * 15
				if((tot[i]+1) >= 25 && tot[j]+1 >= 3)score++;
				if((tot[i]+1) >= 3 && tot[j]+1 >= 25)score++;
				if((tot[i]+1) >= 5 && tot[j]+1 >= 15)score++;
				if((tot[i]+1) >= 15 && tot[j]+1 >= 5)score++;
				
				for(int k = j+1; k < 26; k++)
				{
					if(tot[k] == 0)continue;
					if((tot[i]+1) >= 3 && tot[j]+1 >= 5 && tot[k]+1 >= 5)score++;
					if((tot[i]+1) >= 5 && tot[j]+1 >= 3 && tot[k]+1 >= 5)score++;
					if((tot[i]+1) >= 5 && tot[j]+1 >= 5 && tot[k]+1 >= 3)score++;
				}
			}
		}
//		System.out.println("Score: ");
		System.out.println(score);

	}

}

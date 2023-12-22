import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		char[][] a = new char[101][101];
		int N = input.nextInt();
		int M = input.nextInt();
		
		input.nextLine();
		
		for (int i=1;i<=N;i++)
		{
			String str = input.nextLine();
			
			char[] ch = str.toCharArray();
			for (int j=1;j<=M;j++){
				a[i][j] = ch[j-1];
			}
		}
		int[] R = new int[101];
		int[] C = new int[101];
		
		for (int i=1;i<=N;i++)
			R[i] = 0;
		for (int j=1;j<=M;j++)
			C[j] = 0;
		
		for (int i=1;i<=N;i++)
		{
			for (int j=1;j<=M;j++){
				if (a[i][j] == '#')
				{
					R[i] = 1;
					break;
				}
			}
		}
		
		for (int j=1;j<=M;j++)
		{
			for (int i=1;i<=N;i++){
				if (a[i][j] == '#')
				{
					C[j] = 1;
					break;
				}
			}
		}
		
		
		for (int i=1;i<=N;i++)
		{
			if (R[i]==0)
				continue;
			else 
			{
				for (int j=1;j<=M;j++){
					if (C[j]==0)
						continue;
					else 
						System.out.print(a[i][j]);
				}	
				System.out.println();
			}
			
		}
		
	}

}

import java.util.Scanner;

class Main
{
    static int N = 100;
    static int[][]M = new int[N][N];


    public static void main(String[] args)
    {
	int n;
	int []p = new int[N + 1];
	int[][]m = new int[N + 1][N + 1];

	Scanner In = new Scanner(System.in);

	n = In.nextInt();

	for(int i = 1; i <= n; i++)
	    {
		p[i - 1] = In.nextInt();
		p[i] = In.nextInt();
	    }

	for(int i = 1; i <= n; i++) m[i][i] = 0;

	for(int j = 2; j <= n; j++)
	    {
		for(int i = 1; i <= n - j + 1; i++)
		    {
			int k = i + j - 1;
			m[i][k] = 200000;
			for(int l = i; l <= k - 1; l++)
			    {
				m[i][k] = ((m[i][k] < m[i][l] + m[l + 1][k] + p[i - 1] * p[l] * p[k]) ? m[i][k] : (m[i][l] + m[l + 1][k] + p[i - 1] * p[l] * p[k])); 
			    }
		    }
	    }
	System.out.println(m[1][n]);
    }
}
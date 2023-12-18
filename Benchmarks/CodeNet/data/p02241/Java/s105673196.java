import java.util.Scanner;

class Main
{
    static int[][]M = new int[100][100];

    static int prim(int n)
    {
	int u, minv;
	int sum = 0;
	int[]d = new int[100];
	int[]f = new int[100];
	int[]cl = new int[100];

	for(int i = 0; i < n; i++)
	    {
		d[i] = 200000;
		f[i] = -1;
		cl[i] = 0;
	    }

	d[0] = 0;

	while(true)
	    {
		minv = 200000;
		u = -1;

		for(int i = 0; i < n; i++)
		    {
			if(minv > d[i] && cl[i] != 2)
			    {
				u = i;
				minv = d[i];
			    }
		    }

		if(u == -1) break;
		cl[u] = 2;

		for(int j = 0; j < n; j++)
		    {
			if(cl[j] != 2 && M[u][j] != 200000)
			    {
				if(d[j] > M[u][j])
				   {
				       d[j] = M[u][j];
				       f[j] = u;
				       cl[j] = 1;
				   }
			    }
		    }
	    }
		for(int i = 0; i < n; i++)
		    {
			if(f[i] != -1) sum += M[i][f[i]];
		    }
	    
	return sum;
    }

    public static void main(String[] args)
    {
	Scanner In = new Scanner(System.in);

	int n = In.nextInt();

	for(int i = 0; i < n; i++)
	    {
		for(int j = 0; j < n; j++)
		    {
			int e = In.nextInt();
			M[i][j] = ((e == -1) ? 200000 : e);
		    }
	    }

	System.out.println(prim(n));

    }
}
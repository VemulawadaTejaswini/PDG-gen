import java.util.*;

class Main
{

    public static void main(String args[])
    {
	Scanner in = new Scanner(System.in);
	int N = in.nextInt();
	int[][] C = new int[N][N];
	for(int i=0;i<N;i++)
	    for(int j=0;j<N;j++)
		C[i][j] = in.nextInt();
	    
	long cost = 0;

	for(int i=0;i<N;i++)
	    for(int j=i+1;j<N;j++)
		cost += Math.min(C[i][j],C[j][i]);

	System.out.println(cost);
    }

}
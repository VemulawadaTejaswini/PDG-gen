import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		int N = in.nextInt();
		int S = in.nextInt();
		
		int[] x = new int[N+1];
		int[] y = new int[N+1];
		
		int min = Integer.MAX_VALUE;
		int key = -1;
		
		for (int i=1;i<=N;i++)
		{
			x[i]= in.nextInt();
			y[i]= Math.abs(x[i] - S);
			
				if ( y[i] < min)
				{
					min = y[i];
					key = i;
				}
		}
		
		
		
		int D=min;
		boolean find = false;
		boolean right = true;
		
		while (D>=1&&!find) {
			right = true;
			for (int i=1;i<=N;i++) {
				if (y[i]%D!=0) {
					D--;
					right = false;
					break;
				}
			}
			if (right) 
				find = true;
		}
		System.out.println(D);
	}
}


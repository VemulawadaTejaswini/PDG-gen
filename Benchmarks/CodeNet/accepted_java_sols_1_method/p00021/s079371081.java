import java.util.Scanner;


public class Main 
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		
		for(int i=0; i<n; i++)
		{
			float[] x = new float[4];
			float[] y = new float[4];
			
			for(int j=0; j<4; j++)
			{
				x[j] = scanner.nextFloat();
				y[j] = scanner.nextFloat();
			}
			
			float ax = x[1]-x[0];
			float ay = y[1]-y[0];
			float bx = x[3]-x[2];
			float by = y[3]-y[2];

			System.out.println((ax*by-ay*bx==0? "YES" : "NO"));
		}
	}
}
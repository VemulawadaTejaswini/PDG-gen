import java.util.Scanner;

public class Main
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		
		for(; scanner.hasNext();)
		{
			float[] x = new float[4];
			float[] y = new float[4];
			for(int i=0; i<4; i++)
			{
				x[i] = scanner.nextFloat();
				y[i] = scanner.nextFloat();
			}
			
			float ax = x[1] - x[0];
			float ay = y[1] - y[0];
			float bx = x[3] - x[2];
			float by = y[3] - y[2];
			float inner = ax*bx  + ay*by;
			
			String output;
			if(-1<inner && inner<1)
			{
				output = "YES";
			}
			else
			{
				output ="NO";
			}
			
			System.out.println(output);
		}
	}
}
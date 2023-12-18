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
				
			String output = "NO";
			for(int i=0; i<4; i++)
			{
				double px, py;
				switch(i)
				{
					case 0:
						px = x[0];
						py = y[0];
						break;
					case 1:
						px = x[0];
						py = y[1];
						break;
					case 2:
						px = x[1];
						py = y[0];
						break;
					default:
						px = x[1];
						py = y[1];
						break;
				}
				if((x[2]<=px && px<=x[3]) && (y[2]<=py && py<=y[3]))
				{
					output = "YES";
					break;
				}
			}
			
			for(int i=0; i<4; i++)
			{
				double px, py;
				switch(i)
				{
					case 0:
						px = x[2];
						py = y[2];
						break;
					case 1:
						px = x[2];
						py = y[3];
						break;
					case 2:
						px = x[3];
						py = y[2];
						break;
					default:
						px = x[3];
						py = y[3];
						break;
				}
				if((x[0]<=px && px<=x[1]) && (y[0]<=py && py<=y[1]))
				{
					output = "YES";
					break;
				}
			}
		
			System.out.println(output);
		}
	}
}
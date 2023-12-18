import java.util.Scanner;


public class Main
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		
		for(; scanner.hasNext();)
		{
			double[] x = new double[4];
			double[] y = new double[4];
			
			for(int i=0; i<4; i++)
			{
				x[i] = scanner.nextDouble();
				y[i] = scanner.nextDouble();
			}
			
			
			String output="YES";
			for(int i=0; i<4; i++)
			{
				double px=0, py=0;
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
					case 3:
						px = x[3];
						py = y[3];
						break;
				}
				if(!((x[0]<=px && px<=x[1]) || (y[0]<=py && py<=y[1])))
				{
					output = "NO";
					break;
				}
			}
		
			System.out.println(output);
		}
	}
}
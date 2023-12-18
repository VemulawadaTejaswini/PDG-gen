import java.util.Scanner;


public class Main
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		
		for(; scanner.hasNext();)
		{
			double[] x = new double[3];
			double[] y = new double[3];
			for(int i=0; i<3; i++)
			{
				x[i] = scanner.nextDouble();
				y[i] = scanner.nextDouble();
			}
			double px = scanner.nextDouble();
			double py = scanner.nextDouble();
			
			double pa_x = px - x[0];
			double pa_y = py - y[0];
			double pb_x = px - x[1];
			double pb_y = py - y[1];
			double pc_x = px - x[2];
			double pc_y = py - y[2];
			
			double axb = pa_x*pb_y - pa_y*pb_x;
			double bxc = pb_x*pc_y - pb_y*pc_x;
			double cxa = pc_x*pa_y - pc_y*pa_x;
			
			String str = "NO";
			if((axb>0 && bxc>0 && cxa>0) || (axb<0 && bxc<0 && cxa<0) )
			{
				str = "YES";
			}
			
			System.out.println(str);
		}
	}
}
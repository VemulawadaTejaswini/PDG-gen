import java.util.Scanner;


public class Main
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		
		boolean[] in_ball = new boolean[3];
		in_ball[0] = true;
		in_ball[1] = false;
		in_ball[2] = false;
		for(; scanner.hasNext();)
		{
			String in = scanner.next();
			String[] w = in.split(",");
			
			int[] n = new int[2];
			for(int i=0; i<2; i++)
			{
				switch (w[i])
				{
					case "A":
						n[i] = 0;
						break;
					case "B":
						n[i] = 1;
						break;
					case "C":
						n[i] = 2;
						break;
				}
			}
			
			boolean buf = in_ball[n[0]];
			in_ball[n[0]] = in_ball[n[1]];
			in_ball[n[1]] = buf;
		}
		
		String[] out = {"A", "B", "C"};
		for(int i=0; i<3; i++)
		{
			if(in_ball[i])
			{
				System.out.println(out[i]);
				break;
			}
		}
	}
}
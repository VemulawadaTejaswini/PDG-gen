import java.util.Scanner;
public class Main
{
	public static void main(String[] args) 
	{
		Scanner in=new Scanner(System.in);
		for(;;)
		{
			int z=in.nextInt();
			if(z==0)
				return;
			int max=0;
			for(int x=1;Math.pow(x, 3)<=Math.pow(z, 3);x++)
				for(int y=1;Math.pow(x, 3)+Math.pow(y, 3)<=Math.pow(z, 3);y++)
				{
					max=(int)Math.max(max,Math.pow(x, 3)+Math.pow(y, 3));
				}
			System.out.println((int)Math.pow(z, 3)-max);
		}
	}
}
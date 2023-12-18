import java.util.Scanner;
public class Main
{
	public static void main(String aeg[])
	{
		Scanner in= new Scanner(System.in);
		while(in.hasNext())
		{
			int W=in.nextInt();
			int B=in.nextInt();
			int H=in.nextInt();
			if((W|B|H)==0)
				return;
			double f1=Math.sqrt((W*W+B*B));
			double f2=Math.sqrt((B*B+H*H));
			double f3=Math.sqrt((H*H+W*W));
			int n=in.nextInt();
			for(int i=0;i<n;i++)
			{
				int r=2*in.nextInt();
				if(r>f1||r>f2||r>f3)
					System.out.println("OK");
				else
					System.out.println("NA");
			}
		}
	}
}
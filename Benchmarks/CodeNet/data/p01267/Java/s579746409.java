import java.util.LinkedList;
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) 
	{
		Scanner in=new Scanner(System.in);
		for(;;)
		{
			int N=in.nextInt();
			int A=in.nextInt(),B=in.nextInt(),C=in.nextInt();
			int X=in.nextInt();
			int f=0;
			if((N|A|B|C|X)==0)
				return;
			LinkedList<Integer> Li=new LinkedList<Integer>();
			for(int i=0;i<N;i++)
				Li.add(in.nextInt());
			for(;;)
			{
				if(Li.get(0)==X)
					Li.remove(0);
				if(Li.isEmpty())
					break;
				X=(A*X+B)%C;
				f++;
				if(f>10000)
					break;
			}
			System.out.println(f>10000 ? -1:f);
		}
	}
}
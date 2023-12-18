import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) 
	{
		Scanner in=new Scanner(System.in);

		int M=1000000;
		boolean a[]=new boolean[M+1];
		Arrays.fill(a, true);
		a[0]=a[1]=false;
		for(int i=0;i*i<=M;i++)
		{
			if(!a[i])
				continue;
			for(int j=i*2;j<=M;j+=i)
				a[j]=false;
		}

		for(;;)
		{
			int N=in.nextInt(),P=in.nextInt();
			if(N==-1&&P==-1)
				return;

			ArrayList<Integer> al1=new ArrayList<Integer>();	
			ArrayList<Integer> al2=new ArrayList<Integer>();
			int cnt=0;
			for(int i=N;;i++)
			{
				if(a[i])
				{
					al1.add(i);
					cnt++;
				}
				if(cnt>=P)
				break;
			}
//			for(int i=N;i<=N+1000;i++)
//				if(a[i])
//					al1.add(i);
			for(int i=0;i<al1.size();i++)
				for(int j=i;j<al1.size();j++)
					al2.add(al1.get(i)+al1.get(j));
			Collections.sort(al2);
			System.out.println(al2.get(P-1));
		}
	}
}
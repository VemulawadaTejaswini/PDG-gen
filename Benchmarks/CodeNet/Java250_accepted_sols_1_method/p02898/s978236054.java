
import java.util.Scanner;

public class Main {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt(),k=sc.nextInt(),ans=0;
		for(int i=1;i<=n;i++)
		{
			if(sc.nextInt()>=k)
				ans++;
		}
		System.out.println(ans);
	}

}

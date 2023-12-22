import java.util.*;
public class Main{
 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int n=in.nextInt();
		int k=in.nextInt();
		for(int i=0;i<=n;i++)
		{
			if((k-(i*2))%4==0)
			{
				int b=(k-(i*2))/4;
				if((b+i)==n)
				{
					System.out.println("Yes");
					System.exit(0);
				}
			}
		}
		System.out.println("No");
	}
}

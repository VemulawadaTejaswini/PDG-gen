import java.util.Scanner;

public class Main{

	public static void main(String[] args) {

		int n,x,m=0;
		int a[] = new int[256];

		Scanner scan = new Scanner(System.in);

		while(true)
		{
			int cnt=0;
			n = scan.nextInt();
			x = scan.nextInt();

			if( (n|x) == 0) break;

			for(int i=1; i<=n; i++)
			{
				for(int j=i+1; j<=n; j++)
				{
					for(int k=j+1; k<=n; k++)
					{
						if(i+j+k == x)
						{
							//System.out.printf("%d %d %d\n", i, j, k);
							cnt++;
						}
					}
				}
			}

			a[m++] = cnt;
		}

		scan.close();

		for(int i=0; i<m; i++) System.out.println(a[i]);
	}
}
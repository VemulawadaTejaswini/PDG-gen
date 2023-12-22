import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
	Scanner In = new Scanner(System.in);

	int n;

	do
	    {
		n = In.nextInt();
	    }while(1 >= n && n >= 100);

	int []a = new int[n];

	for(int i = 0; i < n; i++)
	    a[i] = In.nextInt();
	
	
	int h = 0;
	int count = 0;
	int flag = 1;

	while(flag == 1)
	    {
		for(int i = 0; i <= n - 1; i++)
		    {
			for(int j = n - 1; j >= h + 1; j--)
			    {
				if(a[j] < a[j-1])
				    {
					int v = a[j];
					a[j] = a[j - 1];
					a[j - 1] = v;
					count++;
					flag = 1;
				    }
				
			    }
			h++;
			flag = 0;
		    }
		
	    }
	for(int u = 0; u < n-1; u++)
	    System.out.print(a[u] + " ");
	
	System.out.println(a[n - 1]);
	System.out.println(count);
    }
}
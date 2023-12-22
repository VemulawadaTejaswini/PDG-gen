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
	    }while(n <= 2 && n >= 200000);

	int []a = new int[n];

	for(int i = 0; i < n; i++)
	    {
		do	    
		    {
			a[i] = In.nextInt();
		    }while(1 >= a[i] && a[i] >= Math.pow(10,9));
	    }

	int minv = a[0];
	int maxv = a[1] - a[0];

	for(int j = 1; j <= n-1; j++)
	    {
		maxv = maxv > (a[j] - minv) ? maxv : (a[j] - minv);
		minv = minv < a[j] ? minv : a[j];
	    }
	System.out.println(maxv);
    }
}
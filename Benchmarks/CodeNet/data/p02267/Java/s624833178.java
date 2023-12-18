import java.util.Scanner;

public class Linear
{

    static int[]Sy(int n)
    {	
	Scanner Instd = new Scanner(System.in);
	int []s = new int[n];
	
	for(int i = 0; i < n; i++)
	    {
	        s[i] = Instd.nextInt();
	    }
	return s;
    }

    static int[] Ty(int q)
    {
	Scanner std = new Scanner(System.in);
	int []t = new int[q];
	
	for(int i = 0; i < q; i++)
	    {
	        t[i] = std.nextInt();
	    }
	return t;
    }

    static int Search(int[]s, int[]t,int n)
    {
	int count = 0;
	int i = 0;
	int key;
	
	while(s[i] != key)
		    {    
			i++;
		    }
		if(i == n)
		    return 0;
	    }
	return i;
	    
    }

    public static void main(String[] args)
    {
	Scanner In = new Scanner(System.in);

	int n = In.nextInt();
	int []S = Sy(n);

	int q = In.nextInt();
	int []T = Ty(q);

	int count = 0;

	for(int i = 0; i < q; i++)
	    {
		int a = Search(S,T,q);

	if(a != 0)
	    count++;
	    }

	System.out.println(count);
    }
}
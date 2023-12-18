import java.util.Scanner;


class Main
{ 

      static int Search(int[]s, int[]t,int n)
    {
	int count = 0;
	int i = 0;

	int key = t[n - 1];

	while(s[i] != key)
	    {    
		i++;
	    }
	if(i == n)
	    return 0;
	
	return i;
    }

    public static void main(String[] args)
    {
	Scanner In = new Scanner(System.in);
	
	int n = In.nextInt();
	int []S =  new int[n];
	
	for(int i = 0; i < n; i++)
	    {
	        S[i] = In.nextInt();
	    }
	
	int q = In.nextInt();
	int []T  = new int[q];
	
	for(int i = 0; i < q; i++)
	    {
		T[i] = In.nextInt();
	    }
	
	int count = 0;
	
	for(int i =0; i < q; i++)
	    {
	int a = Search(S,T,q);

	if(a != 0)
	    count++;
	    }
	System.out.println(count);
    }
}
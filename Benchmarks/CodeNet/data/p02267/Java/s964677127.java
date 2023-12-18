import java.util.Scanner;

class Main
{ 

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
		int a = 0;
		int key = T[q - 1];

		while(S[a] != key)
		    {    
			a++;
		    }
		if(i == q)
		    a = 0;


	if(a != 0)
	    count++;
	    }
	System.out.println(count);
    }
}
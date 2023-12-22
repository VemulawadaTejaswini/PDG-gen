import java.util.*;

class Main
{
    public static void main(String args[])
    {
	int n, q, C=0;
	long S[] = new long[100000];
	long k;
	int left, right, mid=0;
	Scanner read = new Scanner(System.in);

	//read
	n=read.nextInt();
	for(int i=0; i<n; i++)S[i]=read.nextInt();

	//search
	q=read.nextInt();
	for(int i=0; i<q; i++)
	    {
		left=0;
		right=n;
		k=read.nextInt();
		while(left<right)
		    {
			mid=(left+right)/2;
			if(S[mid]==k)
			    {
				C++;
				break;
			    }
			else if(S[mid]<k)left=mid+1;
			else right=mid;
		    }
	    }

	//print
	read.close();
	System.out.println(C);


    }
}
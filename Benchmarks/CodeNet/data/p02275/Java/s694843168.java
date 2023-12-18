import java.util.*;

class Main
{
    static class Len
    {
	int[] a = new int[10000];
	int[] b = new int[2000000];
	int[] c = new int[2000000];
	int maxA=0;

	Len()
	{
	    for(int i=0; i<10000; i++)a[i]=0;
	    for(int i=0; i<2000000; i++)
		{
		    b[i]=0;
		    c[i]=0;
		}
	}
    }

    public static void main(String[] args)
    {
	int n;
	Len len = new Len();

	int i;
	Scanner read = new Scanner(System.in);

	//read n
	n = read.nextInt();
	for(i=0; i<n; i++)
	    {
		len.a[i] = read.nextInt();
		if(len.a[i]>len.maxA)len.maxA=len.a[i];
	    }

	//sort
	countingSort(len, n);

	//print
	for(i=1; i<n; i++)System.out.print(len.b[i]+" ");
	System.out.println(len.b[n]);
    }

    //sort
    static void countingSort(Len len, int n)
    {
	int i;
	for(i=0; i<n; i++)len.c[len.a[i]]++;

	for(i=0; i<n; i++)
	    {
		if(i!=0)len.c[i]+=len.c[i-1];
		else len.c[i]=len.c[i];
	    }

	for(i=n; i>=0; i--)
	    {
		len.b[len.c[len.a[i]]] = len.a[i];
		len.c[len.a[i]]--;
	    }
    }
}
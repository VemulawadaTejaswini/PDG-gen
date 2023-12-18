import java.util.*;

class Main
{
    static class Len
    {
	int[] a = new int[10000];
	int[] b = new int[2000000];
	int[] c = new int[2000000];

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
	for(i=0; i<n; i++)len.a[i] = read.nextInt();

	//sort
	countingSort(len, n);

	//print
	for(i=0; i<n-1; i++)System.out.print(len.b[i]+" ");
	System.out.println(len.b[i+1]);
    }

    //sort
    static void countingSort(Len len, int k)
    {
	int i;
	for(i=0; i<k; i++)len.c[len.a[i]]++;
	for(i=1; i<k; i++)len.c[i]+=len.c[i-1];
	for(i=k-1; i>=0; i--)
	    {
		len.b[len.c[len.a[i]]] = len.a[i];
		len.c[len.a[i]] = len.c[len.a[i]]-1;
	    }

    }

}
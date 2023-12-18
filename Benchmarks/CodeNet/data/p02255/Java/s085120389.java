import java.util.Scanner;

public class Main{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] ar = new int[n];
		for(int i=0 ; i<n ; i++ )
		{
			ar[i] = sc.nextInt();
		}
		printAr(ar,-1);
		for(int j = 1; j < n ;j++)
		{
			int tar = ar[j];
			int k = j;
			while(k > 0 && tar < ar[k-1])
			{
				ar[k] = ar[k-1];
				k--;
				ar[k] = tar;
			}
			printAr(ar,j);
			
			
		}
	}
	public static void printAr(int[] a,int c){
		int i;
		for(i = 0 ; i < a.length-1 ; i++){
			System.out.print(a[i]+" ");
		}
			System.out.println(a[i]);	
	}
	
}
 

 
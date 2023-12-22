import java.util.*;
import java.io.*;

class Main
{
  	public static void main(String[] args)
    {
		Scanner s = new Scanner(System.in);
      	int n = s.nextInt();
      	int[] a = new int[n];
      	int[] b = new int[n];
      	for(int i = 0 ; i<n ; i++)a[i] = s.nextInt();
      	for(int i = 0 ; i<n ; i++)b[i] = s.nextInt();
      	int sum = 0;
      	for(int i = 0 ;  i<n ;i++)
        {
          	if(a[i]>b[i])sum+=(a[i]-b[i]);
        }
      	System.out.println(sum);
    }
}
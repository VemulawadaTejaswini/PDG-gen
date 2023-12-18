import java.util.*;
class Main 
{ 
static long xorArray(long arr[], int n) 
{ 
    long r = 0; 
    for (int i = 0; i < n; i++) 
        r = r ^ arr[i]; 
  
    return r; 
} 
static int totalWay(long arr[], int n) 
{ 
    long xorArr = xorArray(arr, n); 
    if (xorArr == 0) 
        return -1; 
    int w = 0; 
  
    for (int i = 0; i < n; i++) 
    { 
        long c = xorArr ^ arr[i]; 
        if (c < arr[i]) 
            w++; 
    } 
    return w; 
} 
  
public static void main(String[] args) 
{ 
	Scanner scan = new Scanner(System.in);
    int n = scan.nextInt();
    long[] a = new long[n];
    for(int i=0;i<n;i++)
    	a[i] = scan.nextLong();
    System.out.println(totalWay(a, n)); 
} 
} 
import java.util.*;
public class Main {



static final int mod = 1000000007;


static long f(int A[], int n) 
{ 

 long array_sum = 0; 
 for (int i = 0; i < n; i++) 
     array_sum = (array_sum + A[i])%mod; 


 long array_sum_square = (array_sum * array_sum+mod)%mod; 

 // calcualting a1^2 + a2^2 + ... + an^2 
 long individual_square_sum = 0; 
 for (int i = 0; i < n; i++) 
     individual_square_sum = (individual_square_sum+(A[i] * A[i]+mod)%mod)%mod; 

 // required sum is (array_sum_square - 
 // individual_square_sum) / 2 
 return (((array_sum_square - individual_square_sum) / 2)+mod)%mod; 
} 


public static void main(String[] args)
{
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int arr[]=new int[n];
	for(int i=0;i<n;i++) {
		arr[i]=sc.nextInt();

	}

System.out.print(f(arr, n));
}
}


import java.util.Arrays;
import java.util.Scanner;

public class Main {
	
	private static int MixJuice(int[] arr, int n, int k) {
		
		Arrays.sort(arr);
		int sum=0;
		for(int i=0;i<k;i++)
		{
			sum+=arr[i];
		}
		return sum;
	}

	public static void main(String[] args) {
			Scanner s= new Scanner(System.in);
//		  char s1= s.next().charAt(0);
//		  
//		  if(s1 >='A' && s1 <= 'Z')
//		    System.out.println("A");
//		   else
//		  	System.out.println("a");
		  
		  int n = s.nextInt();
		  int k=s.nextInt();
		  int[] arr = new int[n];
		  for(int i=0;i<arr.length;i++)
		  {
			  arr[i]=s.nextInt();
		  }
		  
		  int result=MixJuice(arr,n,k);
		  System.out.println(result);
	}

	

}

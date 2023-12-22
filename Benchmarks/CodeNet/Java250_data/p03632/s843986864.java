import java.util.*;

public class Main {

	public static void main (String[] args)
	{
		Scanner sc = new Scanner (System.in);
		int[] A= new int[2];
		int[] B  = new int[2];
		int max_low=0;
		int min_high=0;
		
		    A[0] = sc.nextInt();
	        A[1] = sc.nextInt();
	        B[0]= sc.nextInt();
	        B[1] = sc.nextInt();
		
		
		max_low=Math.max(A[0],B[0]);
		min_high= Math.min(A[1],B[1]);
		
		if (max_low>min_high)
			System.out.println("0");
		
		else
			System.out.println(min_high-max_low);
		
		
	}
}

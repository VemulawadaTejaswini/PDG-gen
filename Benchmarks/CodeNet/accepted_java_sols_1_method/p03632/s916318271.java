import java.util.*;
import java.io.*; 

public class Main {

	public static void main (String[] args) throws IOException
	{
	    
		BufferedReader br= new BufferedReader (new InputStreamReader(System.in) );
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int[] A= new int[2];
		int[] B  = new int[2];
		int max_low=0;
		int min_high=0;
		
		A[0] = Integer.parseInt(st.nextToken());
        A[1] = Integer.parseInt(st.nextToken());
        B[0] = Integer.parseInt(st.nextToken());
        B[1] = Integer.parseInt(st.nextToken());
		
		max_low=Math.max(A[0],B[0]);
		min_high= Math.min(A[1],B[1]);
		
		if (max_low>min_high)
			System.out.println("0");
		
		else
			System.out.println(min_high-max_low);
		
		
	}
}
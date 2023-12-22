
import java.util.*;
import java.util.Arrays; 
public class Main{
	
	void cal()
	{
		Scanner sc=new Scanner(System.in);
		int N,K;
		N=sc.nextInt();
		K=sc.nextInt();
		
		
		int Health[]=new int[N];
		
		
		for(int i=0;i<N;i++)
		{
			Health[i]=sc.nextInt();				
		}
		
		Arrays.sort(Health);
	     
	    	long  mov=0;
	    	 N=N-K;
	    	 for(int i=0;i<N;i++)
	 		{
	 			mov+=Health[i];
	 				
	 		}
	    	 System.out.println(mov);
	    	 
	     	
		sc.close();
		
	}

public static void main (String args[])
{
	Main obj= new Main();
	obj.cal();

}
}




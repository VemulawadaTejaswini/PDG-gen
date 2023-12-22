
import java.util.*;

public class Main{
    public static void main(String args[])
    {
    	boolean ans=true;
        Scanner sc=new Scanner(System.in);     
        int size=sc.nextInt();
        int elements[]=new int[ size];
        for(int i=0;i<size;i++)
        {
        	elements[i]=sc.nextInt();
        	   	
        }
        Arrays.sort(elements);
        for(int j=size-1;j>0;j--)
        {
        if(elements[j]==elements[j-1])
        {
        	ans=false;
        	break;
        }
        }
        
        if(ans)
       System.out.println("YES");
        else
        {
        	System.out.println("NO");
        	
        
        }
        
        sc.close();
        
    }
    
}
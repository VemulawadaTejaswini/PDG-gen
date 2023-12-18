import java.util.*;

public class Main
{
	public static void main(String ards[])
    {
    	Scanner sc=new Scanner(System.in);
      	int[] x=new int[5];
      	int res=0;
      	for(int i=0;i<5;i++)
        {
        	x[i]=sc.nextInt();
          	if(x[i]==0)
            	res=i+1;
        }
      	System.out.println(res);
    }
}
import java.util.*;

public class Main{
public static void main(String[] args)
{
		Scanner sc=new Scanner(System.in);
  		int n=sc.nextInt();
  		int[] p=new int[n];
  
  		for(int i=0;i<n;i++)
          p[i]=sc.nextInt();
  int ans=0;
  		for(int i=0;i<n;i++)
        {	int j=0;
        	for( j=0;j<n;j++)
            {	if(i==j)
              	continue;
             if(p[j]%p[i]==0)
               break;
            }
         if(j==n)
          ans++;
        }
          System.out.println(ans);
}
}
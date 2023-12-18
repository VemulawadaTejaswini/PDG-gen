import java.util.*;
public class Main{
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
  ArrayList<Integer> a=new ArrayList<Integer>();
    int count=0,c1=0;
    for(int i=0;i<n;i++)
        a.add(sc.nextInt());
    Collections.sort(a);
    int x=n-1,j=x-1;
   while(j>=0)
   {
         // System.out.print(j);
          if(a.get(x)%a.get(j)==0)
	{
		count++;
		x--;
		j=x;
                                  
	}
                  if(j==0)
	{
		x--;
		j=x;
	}

	      j--;
             
   }
   if(a.get(0)==a.get(1))
	count++;
    System.out.println(n-count);
}
}            
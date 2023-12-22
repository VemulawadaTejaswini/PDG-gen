import java.util.*;
public class Main
{
  public static void main(String[] args)
  {
    Scanner s=new Scanner(System.in);
    int n=s.nextInt();
   int a[]=new int[n];
   HashSet<Integer> h=new HashSet<Integer>();
boolean b=true;
  for(int i=0;i<n;i++)
  {
    a[i]=s.nextInt();
if(b)
{
if(h.contains(a[i]))
b=false;
else
{
h.add(a[i]);
}
}
}
if(b)
System.out.println("YES");
else
    {
     System.out.println("NO");
   }
}
}

   


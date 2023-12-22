import java.util.*;

public class Main{
public static void main(String[] args)
{ 
  Scanner sc=new Scanner(System.in);
  int x=sc.nextInt();
  int n=sc.nextInt();
  Set<Integer> set =new HashSet<>();
  for(int i=0;i<n;i++)
    set.add(sc.nextInt());
  int ans=x;
  for(int i=x,j=x;;i++,j--)
  {  if(!set.contains(i))
    { ans=i;
     break;}
   
   else if(!set.contains(j-1))
    {ans=j-1;
      break;}
    
    else if(!set.contains(i+1))
    { ans=i+1;
     break;}
    
  }

  System.out.println(ans);
}
 
}

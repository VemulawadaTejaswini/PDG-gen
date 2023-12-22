import java.util.*;
class Main
{
  public static void main(String args[])
  {
    Scanner in=new Scanner(System.in);
    int a=in.nextInt();
    HashSet<String> set=new HashSet<>();
    while(a>0)
    {
     String s=in.next();
     set.add(s);
      
      
      a--;
    }
    System.out.print(set.size());
    
  }
}
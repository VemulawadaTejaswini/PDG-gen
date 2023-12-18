import java.util.*;
class Main
{
  public static void main(String [] args)
  {
    Scanner s = new Scanner(System.in);
   int num = s.nextInt();
    int n = s.nextInt();
    
    HashSet<Integer>h = new HashSet<>();
    
   	for(int i = 0; i < n;i++)
      h.add(s.nextInt());
    
    int count = 0;
    boolean found = false;
    int prev = 0;
    
    while(!found)
    {
      if(!(h.contains(num - count))) found = true;
      prev = count; 
      if(count > 0)
           count = 0 - count;
      else
           count = 0 - count + 1;
     
    }
           
    System.out.println(num - prev);
                          
  }
}
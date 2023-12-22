import java.util.*;
public class Main{
  public static void main(String[] args)
  {
    Scanner input = new Scanner(System.in);
    int n = input.nextInt();
    int g = 0;
    
    HashMap<Integer,Integer> map = new HashMap<>();
    
    for(int i=1;i<=n;i++)
    {
      if(n%i==0)
        map.put(i,n/i);
    }
    int h = -1;
    for(int p:map.keySet())
    {
      if(p<10&&map.get(p)<10){
        System.out.println("Yes");
        h=0;
        break;
      }
      else
        h = -1;
      
    }
    if(h==-1)
      System.out.println("No");
    
  }
}

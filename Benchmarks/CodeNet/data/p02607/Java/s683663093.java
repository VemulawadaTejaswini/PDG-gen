import java.util.*;

public class Main{
  
  
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    List<Integer> list = new ArrayList<Integer>();
    for(int i = 0; i < N; i++)
    {
      if(i % 2 == 1)
      {
      	list.add(sc.nextInt());
      }
    }
    
    long s = list.stream().filter(v -> v % 2 == 1).count();
    
    System.out.println(s);
    
  }
  
}

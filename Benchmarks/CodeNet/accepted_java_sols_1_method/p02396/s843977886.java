import java.util.*;
import java.io.*;
import static java.lang.System.*;

public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    List<Integer> list = new ArrayList<Integer>();
    //for(int i=0; i<list.size(); i++)
    //{
    //  System.out.println(list.get(i));
    //}

    while(true)
    {
      int in = sc.nextInt();
      if(in == 0)break;
      list.add(in);
    }
    for(int i=0; i<list.size(); i++)
    {
      out.printf("Case %d: %d\n", i+1, list.get(i));
    }
  }
}

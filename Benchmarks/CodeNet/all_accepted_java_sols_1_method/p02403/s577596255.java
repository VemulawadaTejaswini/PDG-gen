import java.util.*;
import java.io.*;
import static java.lang.System.*;

public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    List<Integer> listX = new ArrayList<Integer>();
    List<Integer> listY = new ArrayList<Integer>();
    while(true)
    {
      int x = sc.nextInt();
      int y = sc.nextInt();
      if(x == 0 && y == 0) break;
      listX.add(x);
      listY.add(y);
    }
    for(int i=0; i<listX.size(); i++)
    {
      int x = listX.get(i);
      int y = listY.get(i);

      for(int j=0; j<x; j++)
      {
        for(int k=0; k<y; k++)
        {
          out.print("#");
        }
        out.println();
      }
      out.println();
    }
  }
}

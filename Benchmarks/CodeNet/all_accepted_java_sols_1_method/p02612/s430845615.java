//'main' method must be in a class 'Rextester'.
//openjdk version '11.0.5' 

import java.util.*;
import java.lang.*;

public class Main
{  
    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);
      int x =s.nextInt();
      if(x%1000==0)
        System.out.println(x%1000);
      else{
      System.out.println(1000-x%1000);
      }
    }
}

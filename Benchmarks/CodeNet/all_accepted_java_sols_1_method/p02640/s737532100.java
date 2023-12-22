import java.util.*;
class Main{
  public static void main(String[] args){
    Scanner sr = new Scanner(System.in);
    int X = sr.nextInt();
    int Y = sr.nextInt();
    int XX = X * 2;
    int Z = Y-XX;
    int z = Z/2;
    if (XX>Y)
      System.out.println("No");
    else if (XX==Y)
      System.out.println("Yes");
    else
      if (Z % 2 != 0)
        System.out.println("No");
      else
        if (z > X)
          System.out.println("No");
        else
           System.out.println("Yes");
    	
     
  }

}
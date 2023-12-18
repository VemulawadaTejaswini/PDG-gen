import java.util.*;
import java.io.*;
iport java.lang.*;
class Main{
  public static void main(String []args)
  {
  Scanner sc = new Scanner(System.in);
    long A=sc.nextInt();
    long B=sc.nextInt();
    if((A*B)>Math.pow(10,18))
      System.out.println(-1);
    else
    System.out.println(A*B);
    
  }
  
}

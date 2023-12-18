import java.util.*;
import java.io.*;
class Main
{
  public static void main(String [] args)
  {
    Scanner sc=new Scanner(System.in);
    int A=sc.nextInt();
    int B=sc.nextInt();
    int H=sc.nextInt();
    int M=sc.nextInt();
    if(H==0)
    H=12;
    if(M==0)
    M=60;
    double h=H*5;
    int ang=(int)Math.abs(M-h)*6;
    double x=(A*A)+(B*B)-(2*A*B*(Math.cos(ang)));
    double c=Math.sqrt(x);
    System.out.print(c);
   
    
  }
}
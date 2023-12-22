import java.io.*;
public class Main
{
  public static void main(String args[]) throws IOException
  {
      BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
      
      int i,A,B,C,D;
      
      //System.out.println();
      
      String s[]=br.readLine().trim().split(" ");
      
      A=Integer.parseInt(s[0]);
      B=Integer.parseInt(s[1]);
      C=Integer.parseInt(s[2]);
      D=Integer.parseInt(s[3]);
      
      A=A+B;
      B=C+D;
      
      if(A>B)
      System.out.println("Left");
      else if(A<B)
      System.out.println("Right");
      else
      System.out.println("Balanced");
  }
}
import java.util.*;
public class Main
{
  public static void main(String args[])
  {
    Scanner in=new Scanner(System.in);
    int A=in.nextInt();
    int B=in.nextInt();
    int C=in.nextInt();
    A=A^B;
    B=A^B;
    A=A^B;
    A=A^C;
    C=A^C;
    A=A^C;
    System.out.print(A+" "+B+" "+C);
  }
}
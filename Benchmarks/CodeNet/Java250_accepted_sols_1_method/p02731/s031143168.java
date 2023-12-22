import java.util.*;
class Main
{
  public static void main(String args[])
  {
    Scanner in=new Scanner(System.in);
    double L=in.nextDouble();
    double p=(double)(L/3);
    double k=p*p*p;
    System.out.println(k);
  }
}
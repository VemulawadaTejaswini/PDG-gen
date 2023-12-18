import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc =new Scanner(System.in);
    long A =sc.nextLong();
    double B =sc.nextDouble();
    long b =(long) B;
    long C =A*b;
    double D =(B-b)*A;
    long E =(long) D;
    System.out.println(C+E);
  }
}
import java.util.*;

class Main{

  public static void main(String args[]){

    Scanner s=new Scanner(System.in);
    double A=s.nextDouble();
    double B=s.nextDouble();
    double ans=A*B;
    long rounded=(long)Math.floor(ans);
    System.out.println(rounded);
  }  
}
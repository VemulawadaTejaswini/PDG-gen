import java.util.*;
public class Main{
  public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    double m=n/2;
    double k=Math.floor(m);
    double l=(n-k)/n;
    System.out.println(l);
  }
}



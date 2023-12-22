import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner scn=new Scanner(System.in);
    int a=scn.nextInt();
    int b=scn.nextInt();
     int c=scn.nextInt();
    
    int t1=a;
    a=b;
    b=t1;
    
    int t2=a;
    a=c;
    c=t2;
    
    System.out.print(a+" "+b+" "+c);
  }
}
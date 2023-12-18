import java.util.*;

class Main{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
//    String s=sc.next();
    long x=sc.nextInt();
//    int a=sc.nextInt();
//    int b=sc.nextInt();
    x=x%2==0?x:x*2;
    System.out.println(x);
  }
}
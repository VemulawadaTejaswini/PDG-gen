import java.util.*;

class Main{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
//    String s=sc.next();
    int x=sc.nextInt();
    int a=sc.nextInt();
    int b=sc.nextInt();
    int d=sc.nextInt();
    System.out.println(Math.min(x,a)+Math.min(b,d));
  }
}